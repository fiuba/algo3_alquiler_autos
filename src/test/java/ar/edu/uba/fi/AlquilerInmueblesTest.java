package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerInmueblesTest {

    @Test
    public void cabaniaPara4InquilinosDurante5DiasCuesta80Dolares() {
        // Arrange
        Cabania cabania = new Cabania("Jose Bonifacio 800", 4);

        // Act
        int alquiler = cabania.calcularAlquilerPorUnosDias(5);

        // Assert
        assertEquals(80, alquiler);
    }

    @Test
    public void habitacionDeHotelCon4CamasDurante5DiasCuesta2020Dolares() {
        // Arrange
        HHotel habitacionHotel = new HHotel("Jose Bonifacio 800", 4);

        // Act
        int alquiler = habitacionHotel.calcularAlquilerPorUnosDias(5);

        // Assert
        assertEquals(2020, alquiler);
    }

    @Test
    public void departamentoCon4MetrosCuadradosDurante5DiasCuesta20Dolares() {
        // Arrange
        Departamento departamento = new Departamento("Jose Bonifacio 800", 4);

        // Act
        int alquiler = departamento.calcularAlquilerPorUnosDias(5);

        // Assert
        assertEquals(20, alquiler);
    }

    @Test
    public void entreDiferentesInmueblesAlquilaElCorrecto() {
        // Arrange
        Agencia agencia = new Agencia(List.of(
                new Cabania("Belgrano 1569", 7),
                new HHotel("Guzman 30", 2),
                new Departamento("Felipe Vallese 890", 30),
                new Departamento("Jose Bonifacio 500", 50),
                new HHotel("Bulrich 650", 6)
        ));

        // Act
        int alquiler = agencia.alquilarInmuebleConDireccionYPorUnosDias("Jose Bonifacio 500", 15);

        // Assert
        assertEquals(750, alquiler);
    }

    @Test
    public void siElInmuebleNoSeEncuentraRetornaCero() {
        // Arrange
        Agencia agencia = new Agencia(List.of(
                new Cabania("Belgrano 1569", 7),
                new HHotel("Guzman 30", 2),
                new Departamento("Felipe Vallese 890", 30),
                new Departamento("Jose Bonifacio 500", 50),
                new HHotel("Bulrich 650", 6)
        ));

        // Act
        int alquiler = agencia.alquilarInmuebleConDireccionYPorUnosDias("Scalabrini Ortiz 890", 7);

        // Assert
        assertEquals(0, alquiler);
    }
}