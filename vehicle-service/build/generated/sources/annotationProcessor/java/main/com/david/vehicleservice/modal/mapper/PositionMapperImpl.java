package com.david.vehicleservice.modal.mapper;

import com.david.vehicleservice.modal.PositionModal;
import com.david.vehicleservice.model.Position;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T19:26:32-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 21.0.1 (Azul Systems, Inc.)"
)
@Component
public class PositionMapperImpl implements PositionMapper {

    @Override
    public PositionModal sourceToTarget(Position position) {
        if ( position == null ) {
            return null;
        }

        PositionModal positionModal = new PositionModal();

        return positionModal;
    }

    @Override
    public Position targetToSource(PositionModal positionModal) {
        if ( positionModal == null ) {
            return null;
        }

        Position position = new Position();

        return position;
    }

    @Override
    public List<PositionModal> listTargetToSource(List<Position> positions) {
        if ( positions == null ) {
            return null;
        }

        List<PositionModal> list = new ArrayList<PositionModal>( positions.size() );
        for ( Position position : positions ) {
            list.add( sourceToTarget( position ) );
        }

        return list;
    }
}
