package ar.edu.uba.fi;

public class Departamento extends Producto {
    private int metrosCuadrados;

    public Departamento(String direccion, int metrosCuadrados){
        super(direccion);
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int calcularAlquilerPorUnosDias(int unosDias){
        return metrosCuadrados * unosDias;
    }
}