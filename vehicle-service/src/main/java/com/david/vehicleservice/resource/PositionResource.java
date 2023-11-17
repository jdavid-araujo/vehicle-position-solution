package com.david.vehicleservice.resource;

import com.david.vehicleservice.modal.PositionModal;
import com.david.vehicleservice.modal.VehicleDataSearchModal;
import com.david.vehicleservice.modal.VehiclePoiTimeModal;
import com.david.vehicleservice.modal.mapper.PositionMapper;
import com.david.vehicleservice.model.Position;
import com.david.vehicleservice.service.PositionService;
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

@Tag(name = "Position", description = "Position management APIs")
@RestController
@RequestMapping(value = "/v1/posicoes")
public class PositionResource {

    private PositionService positionService;
    private PositionMapper positionMapper;

    public PositionResource(PositionService positionService, PositionMapper positionMapper) {
        this.positionService = positionService;
        this.positionMapper = positionMapper;
    }


    @Operation(summary = "Update an existing Position")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Position was updated"),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "404",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
    })
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{id}")
    private void update(@PathVariable Long id, @Valid @RequestBody PositionModal position) {
        Position entity = this.positionMapper.targetToSource(position);

        this.positionService.update(id, entity);
    }

    @Operation(summary = "Find  by id an existing Position")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Position was found",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Position.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "500",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
    })
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    private Position findById(@PathVariable Long id) {
        return this.positionService.findById(id);
    }

    @Operation(summary = "Delete a Position by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Position deleted successfully"),
            @ApiResponse(responseCode = "404",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "500",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
    })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    private void delete(@PathVariable Long id) {
        this.positionService.deleteById(id);
    }

    @Operation(summary = "Search the period of time of a vehicle on a Poi")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "It was able to get the result",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(type = "array", implementation = PositionModal.class))),
            @ApiResponse(responseCode = "400", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
            @ApiResponse(responseCode = "500",  content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Error.class))),
    })
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/search")
    public List<PositionModal> search(@Valid @RequestBody VehicleDataSearchModal vehicleDataSearchModal) {
        List<Position> positions =  this.positionService.findPositionByDateAndVehicle(  vehicleDataSearchModal.getStartDatePostion()
                , vehicleDataSearchModal.getEndDatePosition()
                , vehicleDataSearchModal.getPlaca());

        List<PositionModal> positionModals = this.positionMapper.listTargetToSource(positions);

    return positionModals;
    }
}
