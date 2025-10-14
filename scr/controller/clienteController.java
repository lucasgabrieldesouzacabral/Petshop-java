package controller;

import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Cliente;


public class ClienteController {

    private List<Cliente> ClientesCadastrados;
    private int proximoIdCliente = 1;

    public ClienteController() {
        this.ClientesCadastrados = new ArrayList<>();
    }

    public void cadastrarCliente(String donoNome, String telefone, String endereco, int idDonoAnimal) {
        Cliente cliente = new Cliente(donoNome, telefone, endereco, idDonoAnimal);
        ClientesCadastrados.add(cliente);
        proximoIdCliente++;
    }

    public boolean adicionarAnimalACliente(int clienteId, Animal novoAnimal) {
        Cliente cliente = buscarClientePorId(clienteId);
        if (cliente != null) {
            cliente.adicionarAnimal(novoAnimal);
            return true;
        }
        return false;
    }
    public Cliente buscarClientePorId(int id) {
        for (Cliente cliente : ClientesCadastrados) {
            if (cliente.getIdDonoAnimal() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listarTodosClientes() {
        return ClientesCadastrados;
    }

}
