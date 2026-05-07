package ar.edu.uba.fi;

public class PlazaPremium extends Plaza{
    private int multiplicadorArbitrario = 150;

    public PlazaPremium(int cantidadAsientos){
        super(cantidadAsientos);
    }
    
    @Override
    public int calcularPrecioPorPlaza(){
        return multiplicadorArbitrario * cantidadAsientos;
    }
}
