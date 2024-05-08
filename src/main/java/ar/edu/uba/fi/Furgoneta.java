package ar.edu.uba.fi;

public class Furgoneta extends Vehiculo {
    private final double pma;

    public Furgoneta(String patente, double pma) {
        super(patente);
        this.pma = pma;
    }

    public Double alquilarPorDias(int dias) {
       return ((300 * pma ) + 500 ) * dias;
    }
}
