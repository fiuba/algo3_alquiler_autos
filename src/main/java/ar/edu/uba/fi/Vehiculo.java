package ar.edu.uba.fi;

public abstract class Vehiculo extends Producto{
    private int precioBase = 500;

    public Vehiculo(String patente){
        super(patente);
    }

    @Override
    public int calcularAlquilerPorUnosDias(int cantidadDias){
        int alquiler = precioBase * cantidadDias;
        return alquiler + this.calcularAlquiler();
    }    

    public abstract int calcularAlquiler(); 
}
