package com.david.vehiclepositionsearchservice.service.impl;


import com.david.vehiclepositionsearchservice.modal.*;
import com.david.vehiclepositionsearchservice.service.PoiService;
import com.david.vehiclepositionsearchservice.service.VehicleService;
import com.david.vehiclepositionsearchservice.service.VeiculosPoiService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class VeiculosPoiServiceImpl implements VeiculosPoiService {
    private VehicleService vehicleService;

    private PoiService poiService;

    public VeiculosPoiServiceImpl(VehicleService vehicleService, PoiService poiService) {
        this.vehicleService = vehicleService;
        this.poiService = poiService;
    }

    /**
     * Calcule the time the vehicle stay on the poi
     * @param vehicleDataSearchModal
     * @return a object containg the placa with the poi ids and the time that the vehicle stay on the poi
     */
    public List<VehiclePoiTimeModal> search(VehicleDataSearchModal vehicleDataSearchModal) {
        List<VehiclePoiTimeModal> veiculoPoiTimeList = new ArrayList<>();

        List<PoiModal> pois = poiService.search("", Pageable.unpaged());

        List<PositionModal> positionsAll = vehicleService.findPositionByDateAndVehicle(vehicleDataSearchModal);

        Map<Long, List<PositionModal>> carMap = positionsAll.stream()
                .collect(Collectors.groupingBy(position -> position.getVehicle().getId()));

        for(Long vehicleId : carMap.keySet()) {
            veiculoPoiTimeList.add(new VehiclePoiTimeModal(vehicleId, carMap.get(vehicleId).get(0).getVehicle().getPlaca(),  this.getQuantityTime(pois, carMap.get(vehicleId))));
            //    veiculoPoiTimeList.put(String.valueOf(vehicleId), this.getQuantityTime(pois, carMap.get(vehicleId)));
        }

        return veiculoPoiTimeList;
    }


    /**
     * Calcule the time that a vehicle stay on each poi basead on each vehicle's position
     * @param pois a List of pois
     * @param positions A list of position of a vehicle
     * @return The time of a vehicle stay on each poi in seconds
     */
    List<PoiTimeModal> getQuantityTime(List<PoiModal> pois, List<PositionModal> positions) {
        List<PoiTimeModal> poiTimeModals = new ArrayList<>();

        for(PoiModal poi : pois) {
            Long time = getRegisterOfPoi(positions, poi);
            poiTimeModals.add(new PoiTimeModal(poi.getId(),poi.getName(), time));
        }

        return poiTimeModals;
    }

    /**
     * Calcule the time that a vehicle stay on each poi basead on each vehicle's position
     * @param poi a List of pois
     * @param positions A list of position of a vehicle
     * @return The time of a vehicle stay on each poi in seconds
     */
    public Long getRegisterOfPoi(List<PositionModal> positions, PoiModal poi ) {
        long timeTotal = 0;
        LocalDateTime firstTime = null;
        LocalDateTime lastTime = null;

        Collections.sort(positions, Comparator.comparing(PositionModal::getDataPosicao));

        for (int index = 0; index < positions.size(); index++) {
            if (this.calcularDistancia(positions.get(index).getLatitude(), positions.get(index).getLongitude(), poi.getLatitude(), poi.getLongitude()) <= poi.getRaio()) {
                if(!ObjectUtils.isEmpty(firstTime)) {
                    lastTime = positions.get(index).getDataPosicao();
                }

                if(ObjectUtils.isEmpty(firstTime)) {
                    firstTime = positions.get(index).getDataPosicao();
                }

            } else {
                if(!ObjectUtils.isEmpty(firstTime) && !ObjectUtils.isEmpty(lastTime)) {
                    timeTotal += Duration.between(firstTime, lastTime).getSeconds();
                }
                firstTime = null;
                lastTime = null;
            }
        }

        if((timeTotal == 0) && !ObjectUtils.isEmpty(firstTime) && !ObjectUtils.isEmpty(lastTime)) {
            return Duration.between(firstTime, lastTime).getSeconds();
        }

        return timeTotal;
    }


    // Another way to calculate

/**
 * Calcule the time that a vehicle stay on each poi basead on each vehicle's position
 * @param pois a List of pois
 * @param positions A list of position of a vehicle
 * @return The time of a vehicle stay on each poi in seconds
 */
   /* List<PoiTimeModal> getQuantityTime(List<Poi> pois, List<Position> positions) {
        List<PoiTimeModal> poiTimeModals = new ArrayList<>();

        for(Poi poi : pois) {
            List<Position> registrosNoPOI = getRegisterOfPoi(positions, poi);

            if(!registrosNoPOI.isEmpty()) {
                LocalDateTime entrada = registrosNoPOI.get(0).getDataPosicao();
                LocalDateTime saida = registrosNoPOI.get(registrosNoPOI.size() - 1).getDataPosicao();

                poiTimeModals.add(new PoiTimeModal(poi.getName(), Duration.between(entrada, saida).getSeconds()));

            }

        }

        return poiTimeModals;
    }*/


    /*public List<Position> getRegisterOfPoi(List<Position> positions, Poi poi ) {
        return positions.stream()
                .filter(registro -> this.calcularDistancia(registro.getLatitude(), registro.getLongitude(), poi.getLatitude(), poi.getLongitude()) <= poi.getRaio())
                .sorted(Comparator.comparing(Position::getDataPosicao))
                .collect(Collectors.toList());
    }*/

    /**
     * Calcule the distance between the coordinates
     * @param lat1
     * @param lon1
     * @param lat2
     * @param lon2
     * @return the distance
     */
    private double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371000; // Raio da Terra em metros

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
}
