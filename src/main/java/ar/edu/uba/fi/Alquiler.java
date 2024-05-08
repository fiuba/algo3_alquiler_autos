package ar.edu.uba.fi;

public class Alquiler {


    private final Alquilable alquilable;
    private final int dias;

    public Alquiler(Alquilable alquilable, int dias) {
        this.alquilable = alquilable;
        this.dias = dias;
    }

    public double calcularPrecio() {
        double precioAlquilable = alquilable.alquilarPorDias(dias);
        return precioAlquilable;
    }
}
