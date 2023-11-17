package com.david.vehiclepositionsearchservice.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PoiModal {

    private Long id;

    private String name;

    private Double  raio;

    private Double  latitude;

    private Double  longitude;
}
