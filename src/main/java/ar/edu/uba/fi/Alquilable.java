package ar.edu.uba.fi;

public interface Alquilable {
    Double alquilarPorDias(int dias);

    boolean esIgualA(Alquilable unAlquilable);

    boolean tieneMismoIdentificador(String identificador);
} 
