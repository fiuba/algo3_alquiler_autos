package ar.edu.uba.fi;

public class Coche extends Vehiculo {

    private final int plazas;
    private final Categoria categoria;
    private final Blindaje blindaje;

    public Coche(String patente, int plazas, Categoria categoria, Blindaje blindaje) {
        super(patente);
        this.plazas = plazas;
        this.categoria = categoria;
        this.blindaje = blindaje;
    }

    public Double alquilarPorDias(int dias) {
        return blindaje.modificarPrecio((500 + categoria.precioPlazas(plazas)) * dias);
    }
}
