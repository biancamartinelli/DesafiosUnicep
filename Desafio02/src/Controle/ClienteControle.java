package Controle;

import Modelo.Cliente;

import java.util.ArrayList;

public class ClienteControle {

    public ClienteControle() {

    }

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void save( Cliente cliente){
        clientes.add(cliente);
    }
    public Cliente findByCpf(String cpf){
        Cliente ret = null;

        for(Cliente cliente: clientes){
            if(cliente.getCpf().equals(cpf)){
                ret = cliente;
            }
        }
        return ret;
    }


}



