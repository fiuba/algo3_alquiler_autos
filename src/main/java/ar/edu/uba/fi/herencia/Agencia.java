package ar.edu.uba.fi.herencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Vehiculo> vehiculos;

    public Agencia() {
        vehiculos = new ArrayList<>();

    }
    public void registrar(Vehiculo otroVehiculo) {
        Vehiculo v = this.encontrarVehiculo( otroVehiculo );

        if ( v != null) {
            throw new VehiculoDuplicado();
        }
        vehiculos.add(otroVehiculo);

    }

    public double alquilarDias(String unaPatenteStr, int unosDias) {
        Patente p = new Patente(unaPatenteStr);
        Vehiculo v = this.encontrarVehiculo( p );

        return v.alquilar(unosDias);
    }

    private Vehiculo encontrarVehiculo(Patente patente) {
        for(Vehiculo v : vehiculos) {
            if ( v.tengoPatente(patente) ) {
                return v;
            }
        }

        throw new RuntimeException();
    }

    private Vehiculo encontrarVehiculo(Vehiculo otroVehiculo) {
        for(Vehiculo v : vehiculos) {
            if ( v.igualA(otroVehiculo) ) {
                return v;
            }
        }

        return null;
    }
}
