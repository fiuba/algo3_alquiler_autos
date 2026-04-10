package ar.edu.uba.fi.herencia;

import ar.edu.uba.fi.interfaces.CostoBase;

public class Auto extends Vehiculo {
    private Integer numeroPlazas;
    private TipoPlaza tipoPlazas;

    private CostoBase costoBase;
    public Auto(String patenteComoString, Integer numeroPlazas, TipoPlaza tipoPlazas) {
        super(new Patente(patenteComoString));
        this.numeroPlazas = numeroPlazas;
        this.tipoPlazas = tipoPlazas;
        this.costoBase = new CostoBase();
    }

    public double alquilar(int unosDias) {

        return precioBase(unosDias) + tipoPlazas.alquilar(numeroPlazas);
    }

    private double precioBase(int unosDias) {

        return this.costoBase.multiplicar(unosDias);
    }


}
