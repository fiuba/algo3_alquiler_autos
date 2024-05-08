package ar.edu.uba.fi;

public class Departamento extends Inmueble {
    private final int m2;

    public Departamento(String direccion, int m2) {
        super(direccion);
        this.m2 = m2;
    }

    public Double alquilarPorDias(int dias) {
        return (double) (m2 * dias);
    }
}
