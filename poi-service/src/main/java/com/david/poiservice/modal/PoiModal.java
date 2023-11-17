package com.david.poiservice.modal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PoiModal {

    @NotBlank
    private String name;

    @NotNull
    private Double  raio;

    @NotNull
    private Double  latitude;

    @NotNull
    private Double  longitude;
}
