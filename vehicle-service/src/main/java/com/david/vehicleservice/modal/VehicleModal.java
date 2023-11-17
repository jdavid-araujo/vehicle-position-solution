package com.david.vehicleservice.modal;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleModal {

    @NotBlank
    private Long id;

    @NotBlank
    private String placa;
}
