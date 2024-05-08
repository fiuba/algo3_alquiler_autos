package ar.edu.uba.fi;

public class Microbus extends Vehiculo {

    public Microbus(String patente) {
        super(patente);
    }

    public Double alquilarPorDias(int dias) {
        return Double.valueOf((1500 * dias) + 500);
    }
}
