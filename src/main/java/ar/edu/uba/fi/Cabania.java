package ar.edu.uba.fi;

public class Cabania extends Inmueble {
    private int cantidadInquilinos;

    public Cabania(String direccion, int capacidad) {
        super(direccion);
        this.cantidadInquilinos = capacidad;
    }

    @Override
    public int calcularAlquilerPorUnosDias(int unosDias){
        return (this.cantidadInquilinos * this.cantidadInquilinos) * unosDias;
    }
}