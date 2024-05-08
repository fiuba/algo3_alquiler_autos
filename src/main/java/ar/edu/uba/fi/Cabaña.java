package ar.edu.uba.fi;

public class Cabaña extends Inmueble {
    private final int inquilinos;

    public Cabaña(String direccion, int inquilinos) {
        super(direccion);
        this.inquilinos = inquilinos;
    }

    public Double alquilarPorDias(int dias) {
        return (double) (dias * (inquilinos * 1000));
    }
}
