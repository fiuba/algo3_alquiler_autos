package ar.edu.uba.fi;

public class HHotel extends Inmueble {
    private int camas;

    public HHotel(String direccion, int camas){
        super(direccion);
        this.camas = camas;
    }

    @Override
    public int calcularAlquilerPorUnosDias(int unosDias){
        return camas * (unosDias + 500);
    }
}