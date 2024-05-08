package ar.edu.uba.fi;

public class Camion extends Vehiculo {

    public Camion(String patente) {
        super(patente);
    }

    public Double alquilarPorDias(int dias) {
        return 30000.00;
    }
}
