package com.david.poiservice.service;


import com.david.poiservice.model.Poi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PoiService extends BaseService<Poi, Long> {

    void save(Poi entity);

    Page<Poi> search(String name, Pageable pageable);
}
