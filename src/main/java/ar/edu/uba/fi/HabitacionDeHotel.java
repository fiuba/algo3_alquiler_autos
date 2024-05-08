package ar.edu.uba.fi;

public class HabitacionDeHotel extends Inmueble {
    private final int camas;

    public HabitacionDeHotel(String direccion, int camas) {
        super(direccion);
        this.camas = camas;
    }

    public Double alquilarPorDias(int dias) {
        return (double) (camas * (dias + 500));
    }
}
