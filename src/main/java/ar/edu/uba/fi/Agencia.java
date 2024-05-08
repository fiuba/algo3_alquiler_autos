package ar.edu.uba.fi;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Alquilable> alquilables = new ArrayList<Alquilable>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrarAlquilable(Alquilable unAlquilable) {
        for(Alquilable alquilable: alquilables){
            if(alquilable.esIgualA(unAlquilable)){
                throw new AlquilableYaRegistradoException();
            }
        }
        alquilables.add(unAlquilable);
    }
 
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Double calcularAlquilerParaCliente(Cliente unCliente) {
        for (Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente.calcularPrecioAlquileres();
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public void registrarAlquiler(Cliente unCliente, Alquilable unAlquilable, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Alquilable alquilable = buscarAlquilable(unAlquilable);

        cliente.registrarAlquiler(alquilable, dias);
    }

    private Alquilable buscarAlquilable(Alquilable unAlquilable) {
        for(Alquilable alquilable: alquilables){
            if(alquilable.esIgualA(unAlquilable)){
                return alquilable;
            }
        }
        throw new AlquilableNoRegistradoException();
    }

    private Cliente buscarCliente(Cliente unCliente) {
        for(Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente;
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public Double calcularAlquilerTotal() {
        double suma = 0;
        for(Cliente cliente: clientes){
            suma += cliente.calcularPrecioAlquileres();
        }
        return suma;
    }
}
