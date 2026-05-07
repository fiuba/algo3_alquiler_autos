package ar.edu.uba.fi;

public class PlazaNormal extends Plaza {

    public PlazaNormal(int cantidadAsientos){
        super(cantidadAsientos);
    }
    
    @Override
    public int calcularPrecioPorPlaza(){
        return 0;
    }
}
