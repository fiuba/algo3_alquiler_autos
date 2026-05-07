package ar.edu.uba.fi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AlquilerVehiculosTest
{
    @Test
    public void unClienteAlquilaUnBMWConCincoPlazasModelo2018DuranteDosDias() {
        Agencia agencia = new Agencia(List.of(
            new Carga("bsd178",1000),
            new Transporte("kin689", "bmw", 2018, 5),
            new Transporte("bhg342", "audi", 2010, 3)
        ));

        int alquiler = agencia.alquilarProductoPorUnosDias("kin689", 2);
        assertEquals(1750, alquiler);
    }

    @Test
    public void unClienteAlquilaUnCamionConPMAMilUnosDiezDias() {
        Agencia agencia = new Agencia(List.of(
            new Carga("bsd178",1000),
            new Transporte("kin689", "bmw", 2018, 5),
            new Transporte("bhg342", "audi", 2010, 3)
        ));

        int alquiler = agencia.alquilarProductoPorUnosDias("bsd178", 10);
        assertEquals(305000, alquiler);
    }
}
