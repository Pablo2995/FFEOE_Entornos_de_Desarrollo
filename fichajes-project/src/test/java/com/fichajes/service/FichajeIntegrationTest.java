package com.fichajes.service;

import com.fichajes.model.Fichaje;
import com.fichajes.service.FichajeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FichajeIntegrationTest {

    @Autowired
    private FichajeService fichajeService;

    @Test
    void testGuardarFichajeIntegracion() {

        Fichaje fichaje = new Fichaje();

        Fichaje guardado = fichajeService.guardar(fichaje);

        assertNotNull(guardado);
    }
}