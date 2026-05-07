package ar.edu.uba.fi;

public class CreadorDePlazas {
    public Plaza crearPlazaPor(String marca, int anio, int cantidadAsientos){
        if (marca.equalsIgnoreCase("BMW") || (marca.equalsIgnoreCase("AUDI") && anio > 2016)) {
            return new PlazaPremium(cantidadAsientos);
        } else {
            return new PlazaNormal(cantidadAsientos);
        }
    }
}
