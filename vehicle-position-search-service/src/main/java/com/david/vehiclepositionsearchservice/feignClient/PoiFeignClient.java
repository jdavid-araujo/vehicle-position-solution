package com.david.vehiclepositionsearchservice.feignClient;

import com.david.vehiclepositionsearchservice.modal.PoiModal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "poi-service")
public interface  PoiFeignClient {
    @GetMapping("/v1/pois/search")
    Page<PoiModal> search(@RequestParam(value = "name", required = false) String name, @PageableDefault(size = 10, sort = "name", direction = Sort.Direction.ASC) Pageable pageable);
}
