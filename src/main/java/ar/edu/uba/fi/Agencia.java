package ar.edu.uba.fi;
import java.util.List;

public class Agencia {
    private List<Inmueble> inmuebles;
    
    public Agencia(List<Inmueble> inmuebles){
        this.inmuebles = inmuebles;
    }

    public int alquilarInmuebleConDireccionYPorUnosDias(String direccion, int cantidadDias){
        int acumulador = 0;
        for(Inmueble inmueble : inmuebles){
            acumulador += inmueble.calcularAlquilerPorUnosDiasSiMiDireccionCoincide(direccion, cantidadDias);
        }
        return acumulador;
    }
}
