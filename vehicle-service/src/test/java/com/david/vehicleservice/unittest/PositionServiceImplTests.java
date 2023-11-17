package com.david.vehicleservice.unittest;

import com.david.vehicleservice.exceptionhandler.ResourceNotFoundException;
import com.david.vehicleservice.model.Position;
import com.david.vehicleservice.repository.PositionRepository;
import com.david.vehicleservice.service.impl.PositionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


public class PositionServiceImplTests {

    @Mock
    private PositionRepository positionRepository;

    @InjectMocks
    private PositionServiceImpl positionService = new PositionServiceImpl(positionRepository);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        // Mocking repository behavior
        Long positionId = 1L;
        Position mockPosition = new Position();
        when(positionRepository.findById(positionId)).thenReturn(Optional.of(mockPosition));

        // Calling the service method
        Position result = positionService.findById(positionId);

        // Verifying the result and interactions
        assertEquals(mockPosition, result);
        verify(positionRepository, times(1)).findById(positionId);
    }

    @Test
    void testFindByIdWithNonExistingPosition() {
        // Mocking repository behavior
        Long positionId = 1L;
        when(positionRepository.findById(positionId)).thenReturn(Optional.empty());

        // Calling the service method should throw an exception
        assertThrows(ResourceNotFoundException.class, () -> positionService.findById(positionId));

        // Verifying the interactions
        verify(positionRepository, times(1)).findById(positionId);
    }

    @Test
    void testFindAll() {
        // Mocking repository behavior
        Position position1 = new Position();
        Position position2 = new Position();
        when(positionRepository.findAll()).thenReturn(Arrays.asList(position1, position2));

        // Calling the service method
        List<Position> result = positionService.findAll();

        // Verifying the result and interactions
        assertEquals(2, result.size());
        verify(positionRepository, times(1)).findAll();
    }


    @Test
    void testFindPositionByDateAndVehicle() {
        // Mocking repository behavior
        LocalDateTime startDate = LocalDateTime.now().minusDays(1);
        LocalDateTime endDate = LocalDateTime.now();
        String placa = "ABC123";
        Position position1 = new Position();
        Position position2 = new Position();

        when(positionRepository.findByDataPosicaoBetweenAndVehicle_PlacaContaining(startDate, endDate, placa))
                .thenReturn(Arrays.asList(position1, position2));

        // Calling the service method
        List<Position> result = positionService.findPositionByDateAndVehicle(startDate, endDate, placa);

        // Verifying the result and interactions
        assertEquals(2, result.size());
        verify(positionRepository, times(1))
                .findByDataPosicaoBetweenAndVehicle_PlacaContaining(startDate, endDate, placa);
    }
}
