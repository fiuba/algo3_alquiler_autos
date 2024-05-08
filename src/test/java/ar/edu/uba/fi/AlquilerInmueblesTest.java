package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AlquilerInmueblesTest
{
    @Test
    public void test01AlAlquilarUnDepartamento3DiasElPrecioEsElCorrecto() {
        Departamento departamento = new Departamento("Calle 123", 60);

        Double valor = departamento.alquilarPorDias(3);

        assertEquals((60 * 3) , valor);
    }

    @Test
    public void test02AlAlquilarUnaHabitacionDeHotelPor3DiasElPrecioEsElCorrecto() {
        HabitacionDeHotel habitacion = new HabitacionDeHotel("Calle 123", 3);

        Double valor = habitacion.alquilarPorDias(3);

        assertEquals((3 * (3 + 500)) , valor);
    }

    @Test
    public void test03AlAlquilarUnaCabañaPor3DiasElPrecioEsElCorrecto() {
        Cabaña cabaña = new Cabaña("Calle 123", 4);

        Double valor = cabaña.alquilarPorDias(3);

        assertEquals((3 * (4 * 1000)) , valor);
    }

    @Test
    public void test04AlRegistrarUnInmuebleConUnaDireccionYaRegistradaSeLanzaExcepcion() {
        Agencia agencia = new Agencia();
        Departamento departamento = new Departamento("Calle 123", 60);
        Cabaña cabaña = new Cabaña("Calle 123", 4);
        agencia.registrarAlquilable(departamento);

        assertThrows(AlquilableYaRegistradoException.class, () -> {agencia.registrarAlquilable(cabaña);});
    }

    @Test
    public void test05AlPedirLosAlquileresDeUnClienteDaElPrecioCorrecto() {
        Agencia agencia = new Agencia();
        Departamento departamento = new Departamento("Calle 123", 60);
        Cabaña cabaña = new Cabaña("Calle 1234", 4);
        Cliente cliente = new Cliente("Diego");

        agencia.registrarAlquilable(departamento);
        agencia.registrarAlquilable(cabaña);
        agencia.registrarCliente(cliente);
        agencia.registrarAlquiler(cliente, departamento, 3);
        agencia.registrarAlquiler(cliente, cabaña, 3);

        Double precioEsperado = Double.valueOf((60 * 3) + (3 * (4 * 1000)));

        Double precioObtenido = agencia.calcularAlquilerParaCliente(cliente);

        assertEquals(precioObtenido , precioEsperado);
    }

    @Test
    public void test06AlPedirLosAlquileresTotalesDaElPrecioCorrecto() {
        Agencia agencia = new Agencia();
        Departamento departamento = new Departamento("Calle 123", 60);
        Cabaña cabaña = new Cabaña("Calle 1234", 4);
        Cliente cliente = new Cliente("Diego");
        Cliente cliente2 = new Cliente("Santi");

        agencia.registrarAlquilable(departamento);
        agencia.registrarAlquilable(cabaña);
        agencia.registrarCliente(cliente);
        agencia.registrarCliente(cliente2);
        agencia.registrarAlquiler(cliente, departamento, 3);
        agencia.registrarAlquiler(cliente, cabaña, 3);
        agencia.registrarAlquiler(cliente2, departamento, 3);
        agencia.registrarAlquiler(cliente2, cabaña, 3);
        agencia.registrarAlquiler(cliente2, cabaña, 3);

        Double precioEsperado = Double.valueOf(((60 * 3) * 2) + ((3 * (4 * 1000)) * 3));

        Double precioObtenido = agencia.calcularAlquilerTotal();

        assertEquals(precioObtenido , precioEsperado);
    }


}
