package com.david.vehiclepositionsearchservice.feignClient;

import com.david.vehiclepositionsearchservice.modal.PositionModal;
import com.david.vehiclepositionsearchservice.modal.VehicleDataSearchModal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "vehicle-service")
public interface VehicleFeignClient {
    @PostMapping("/v1/posicoes/search")
    List<PositionModal> findPositionByDateAndVehicle(@RequestBody VehicleDataSearchModal vehicleDataSearchModal);
}
