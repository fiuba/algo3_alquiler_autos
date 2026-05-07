package ar.edu.uba.fi;

public class Transporte extends Vehiculo{
    private Plaza tipoDeplaza;

    public Transporte(String patente, String marca, int anio, int cantidadAsientos){
        super(patente);
        CreadorDePlazas creador = new CreadorDePlazas();
        this.tipoDeplaza = creador.crearPlazaPor(marca, anio, cantidadAsientos);
    }

    @Override
    public int calcularAlquiler(){
        return this.tipoDeplaza.calcularPrecioPorPlaza();
    }
}
