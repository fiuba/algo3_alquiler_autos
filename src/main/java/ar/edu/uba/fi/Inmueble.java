package ar.edu.uba.fi;

public abstract class Inmueble {
    private String direccion;

    public Inmueble(String direccion){
        this.direccion = direccion;
    }
    
    public int calcularAlquilerPorUnosDiasSiMiDireccionCoincide(String direccion, int unosDias){
        if (this.direccion.equals(direccion)) {
            return this.calcularAlquilerPorUnosDias(unosDias);
        } else {
            return 0;
        }
    }

    public abstract int calcularAlquilerPorUnosDias(int unosDias);
}