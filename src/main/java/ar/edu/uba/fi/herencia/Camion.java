package ar.edu.uba.fi.herencia;

import ar.edu.uba.fi.interfaces.CostoBase;

public class Camion extends Vehiculo {
    private int pma;
    private final CostoBase costoBase;

    public Camion(String patenteComoString, int pma) {
        super(new Patente(patenteComoString));
        this.pma = pma;
        this.costoBase = new CostoBase();
    }

    @Override
    public double alquilar(int unosDias) {


        return precioBase(unosDias) + (300*pma);
    }

    private double precioBase(int unosDias) {


        return this.costoBase.multiplicar(unosDias);
    }

}
