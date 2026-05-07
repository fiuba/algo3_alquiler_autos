package ar.edu.uba.fi;

public abstract class Producto implements Alquilable {
    String idProducto;

    public Producto(String idProducto){
        this.idProducto = idProducto;
    }

    @Override
    public int calcularAlquilerPorUnosDiasSiMiIdCoincide(String idProducto, int cantidadDias){
        if (this.idProducto.equalsIgnoreCase(idProducto)) {
            return this.calcularAlquilerPorUnosDias(cantidadDias);
        } else {
            return 0;
        }
    }

    public abstract int calcularAlquilerPorUnosDias(int cantidadDias);
}
