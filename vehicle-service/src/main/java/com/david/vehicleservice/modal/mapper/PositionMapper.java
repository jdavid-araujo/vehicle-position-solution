package com.david.vehicleservice.modal.mapper;

import com.david.vehicleservice.modal.PositionModal;
import com.david.vehicleservice.model.Position;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {

    PositionModal sourceToTarget(Position position);

    //@Mapping(target = "id", ignore = true)
    Position targetToSource(PositionModal positionModal);

    List<PositionModal> listTargetToSource(List<Position> positions);
}
