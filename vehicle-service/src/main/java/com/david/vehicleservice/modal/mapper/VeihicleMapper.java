package com.david.vehicleservice.modal.mapper;

import com.david.vehicleservice.modal.VehicleModal;
import com.david.vehicleservice.model.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VeihicleMapper {

    VehicleModal sourceToTarget(Vehicle vehicle);

    @Mapping(target ="id", ignore = true)
    Vehicle targetToSource(VehicleModal vehicleModal);
}
