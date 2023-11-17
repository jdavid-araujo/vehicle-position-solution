package com.david.vehicleservice.modal;

import com.david.vehicleservice.enumeration.BooleanEnum;
import jakarta.validation.constraints.NotNull;
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
