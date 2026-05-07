package ar.edu.uba.fi;

public class Carga extends Vehiculo {
    private int pma;
    private int multiplicadorArbitrario = 300;
    
    public Carga(String patente, int pma){
        super(patente);
        this.pma = pma;
    }

    @Override
    public int calcularAlquiler(){
        return multiplicadorArbitrario * pma;
    }
}
