package com.david.vehiclepositionsearchservice.service;

import com.david.vehiclepositionsearchservice.modal.PositionModal;
import com.david.vehiclepositionsearchservice.modal.VehicleDataSearchModal;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface VehicleService {

    List<PositionModal> findPositionByDateAndVehicle(VehicleDataSearchModal vehicleDataSearchModal);
}
