package com.david.vehiclepositionsearchservice.service.impl;

import com.david.vehiclepositionsearchservice.feignClient.PoiFeignClient;
import com.david.vehiclepositionsearchservice.modal.PoiModal;
import com.david.vehiclepositionsearchservice.service.PoiService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoiServiceImpl implements PoiService {

    private PoiFeignClient poiFeignClient;

    public PoiServiceImpl(PoiFeignClient poiFeignClient) {
        this.poiFeignClient = poiFeignClient;
    }
    @Override
    public List<PoiModal> search(String name, Pageable pageable) {
        return this.poiFeignClient.search(name, pageable).getContent();
    }
}
