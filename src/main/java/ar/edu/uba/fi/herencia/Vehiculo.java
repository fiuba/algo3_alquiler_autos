package ar.edu.uba.fi.herencia;

public abstract class Vehiculo {

    private Patente patente;

    public Vehiculo(Patente patente) {
        this.patente = patente;
    }

    boolean tengoPatente(Patente unaPatente) {
        return this.patente.equals(unaPatente);
    }

    abstract double alquilar(int unosDias);

    public boolean igualA(Vehiculo vehiculo) {
        return this.patente.equals(vehiculo.patente);
    }
}
