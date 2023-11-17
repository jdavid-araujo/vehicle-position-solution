package com.david.vehicleservice.service;

import com.david.vehicleservice.model.Position;
import com.david.vehicleservice.model.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VehicleService extends BaseService<Vehicle, Long> {

    void save(Vehicle entity);

    Page<Position> findAllByVehicleId(Long id, Pageable pageable);

    void savePosition(Long id, Position position);

    Page<Vehicle> search(String parameter, Pageable pageable);

}
