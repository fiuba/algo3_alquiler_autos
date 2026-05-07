package ar.edu.uba.fi;

public abstract class Plaza {
    protected int cantidadAsientos;

    public Plaza(int cantidadAsientos){
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public abstract int calcularPrecioPorPlaza();
}
