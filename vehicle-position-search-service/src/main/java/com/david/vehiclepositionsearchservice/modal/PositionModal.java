package com.david.vehiclepositionsearchservice.modal;

import com.david.vehiclepositionsearchservice.enumeration.BooleanEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PositionModal {

    private Long id;

    private VehicleModal vehicle;

    private LocalDateTime dataPosicao;

    private Double  velociadde;

    private Double   longitude;

    private Double  latitude;

    private BooleanEnum ignicao;
}
