package ar.edu.uba.fi;

public class Cabania extends Producto {
    private int cantidadInquilinos;

    public Cabania(String direccion, int cantidadInquilinos) {
        super(direccion);
        this.cantidadInquilinos = cantidadInquilinos;
    }

    @Override
    public int calcularAlquilerPorUnosDias(int unosDias){
        return (this.cantidadInquilinos * this.cantidadInquilinos) * unosDias;
    }
}