package com.david.poiservice.modal.mapper;

import com.david.poiservice.modal.PoiModal;
import com.david.poiservice.model.Poi;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PoiMapper {

    PoiModal sourceToTarget(Poi poi);

    @Mapping(target = "id", ignore = true)
    Poi targetToSource(PoiModal poiModal);
}
