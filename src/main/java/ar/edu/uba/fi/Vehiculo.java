package ar.edu.uba.fi;

public abstract class Vehiculo implements Alquilable{
    protected String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean esIgualA(Alquilable unVehiculo){
        return unVehiculo.tieneMismoIdentificador(this.patente);
    }
    @Override
    public boolean tieneMismoIdentificador(String patente){
        return (this.patente == patente);
    }
}
