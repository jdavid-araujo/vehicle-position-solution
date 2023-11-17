package com.david.vehicleservice.modal.mapper;

import com.david.vehicleservice.modal.VehicleModal;
import com.david.vehicleservice.model.Vehicle;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T19:27:03-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 21.0.1 (Azul Systems, Inc.)"
)
@Component
public class VeihicleMapperImpl implements VeihicleMapper {

    @Override
    public VehicleModal sourceToTarget(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleModal vehicleModal = new VehicleModal();

        vehicleModal.setId( vehicle.getId() );
        vehicleModal.setPlaca( vehicle.getPlaca() );

        return vehicleModal;
    }

    @Override
    public Vehicle targetToSource(VehicleModal vehicleModal) {
        if ( vehicleModal == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setPlaca( vehicleModal.getPlaca() );

        return vehicle;
    }
}
