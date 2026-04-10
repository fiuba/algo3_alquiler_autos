package ar.edu.uba.fi.herencia;

public class Patente {

    private String valor;

    public Patente(String valor) {
        this.valor = valor;
    }

    public boolean equals(Patente otraPatente) {
        return this.valor.equals(otraPatente.valor);
    }
}
