package com.fichajes.service;

import com.fichajes.model.Fichaje;
import com.fichajes.repository.FichajeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FichajeServiceTest {

    @Mock
    private FichajeRepository fichajeRepository;

    @InjectMocks
    private FichajeService fichajeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testObtenerTodos() {

        List<Fichaje> lista = Arrays.asList(
                new Fichaje(),
                new Fichaje()
        );

        when(fichajeRepository.findAll()).thenReturn(lista);

        List<Fichaje> resultado = fichajeService.obtenerTodos();

        assertEquals(2, resultado.size());
    }

    @Test
    void testGuardar() {

        Fichaje fichaje = new Fichaje();

        when(fichajeRepository.save(fichaje))
                .thenReturn(fichaje);

        Fichaje resultado = fichajeService.guardar(fichaje);

        assertNotNull(resultado);
    }

    @Test
    void testBuscarPorId() {

        Fichaje fichaje = new Fichaje();
        fichaje.setId(1L);

        when(fichajeRepository.findById(1L))
                .thenReturn(Optional.of(fichaje));

        Fichaje resultado = fichajeService.obtenerPorId(1L);

        Assertions.assertEquals(1, resultado.getId());
    }
}