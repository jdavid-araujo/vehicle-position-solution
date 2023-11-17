package com.david.vehiclepositionsearchservice.service.impl;

import com.david.vehiclepositionsearchservice.feignClient.VehicleFeignClient;
import com.david.vehiclepositionsearchservice.modal.PositionModal;
import com.david.vehiclepositionsearchservice.modal.VehicleDataSearchModal;
import com.david.vehiclepositionsearchservice.service.VehicleService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleFeignClient vehicleFeignClient;

    public VehicleServiceImpl(VehicleFeignClient vehicleFeignClient) {
        this.vehicleFeignClient = vehicleFeignClient;
    }

    @Override
    public List<PositionModal> findPositionByDateAndVehicle(VehicleDataSearchModal vehicleDataSearchModal) {
        return this.vehicleFeignClient.findPositionByDateAndVehicle(vehicleDataSearchModal);
    }
}
