package com.david.vehiclepositionsearchservice.resource;

import com.david.vehiclepositionsearchservice.modal.VehicleDataSearchModal;
import com.david.vehiclepositionsearchservice.modal.VehiclePoiTimeModal;
import com.david.vehiclepositionsearchservice.service.VeiculosPoiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Vehicle", description = "Vehicle management APIs")
@RestController
@RequestMapping("/v1/veiculos-poi")
public class VeiculosPoiResource {

    private VeiculosPoiService veiculosPoiService;

    public VeiculosPoiResource(VeiculosPoiService veiculosPoiService) {
        this.veiculosPoiService = veiculosPoiService;
    }

    @Operation(summary = "Search the period of time of a vehicle on a Poi")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "It was able to get the result",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(type = "array", implementation = VehiclePoiTimeModal.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "500",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
    })
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/tempo-poi")
    public List<VehiclePoiTimeModal> search(@Valid @ModelAttribute VehicleDataSearchModal vehicleDataSearchModal) {
        return this.veiculosPoiService.search(vehicleDataSearchModal);
    }
}
