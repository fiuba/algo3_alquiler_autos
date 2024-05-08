package ar.edu.uba.fi;

public abstract class Inmueble implements Alquilable{
    protected String direccion;

    public Inmueble(String direccion) {
        this.direccion = direccion;
    };

    @Override
    public boolean esIgualA(Alquilable unVehiculo){
        return unVehiculo.tieneMismoIdentificador(this.direccion);
    }
    @Override
    public boolean tieneMismoIdentificador(String direccion){
        return (this.direccion == direccion);
    }
}
