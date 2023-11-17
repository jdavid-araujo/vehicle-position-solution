package com.david.vehiclepositionsearchservice.service;

import com.david.vehiclepositionsearchservice.modal.VehicleDataSearchModal;
import com.david.vehiclepositionsearchservice.modal.VehiclePoiTimeModal;

import java.util.List;

public interface VeiculosPoiService {

    List<VehiclePoiTimeModal> search(VehicleDataSearchModal vehicleDataSearchModal);

}
