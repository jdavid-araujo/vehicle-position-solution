package com.david.vehiclepositionsearchservice.service;

import com.david.vehiclepositionsearchservice.modal.PoiModal;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PoiService {
    List<PoiModal> search(String name, Pageable pageable);
}
