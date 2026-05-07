package ar.edu.uba.fi;
import java.util.List;

public class Agencia {
    private List<Alquilable> productos;
    
    public Agencia(List<Alquilable> productos){
        this.productos = productos;
    }

    public int alquilarProductoPorUnosDias(String idProducto, int cantidadDias){
        int acumulador = 0;
        for(Alquilable producto : productos){
            acumulador += producto.calcularAlquilerPorUnosDiasSiMiIdCoincide(idProducto, cantidadDias);
        }
        return acumulador;
    }

}
