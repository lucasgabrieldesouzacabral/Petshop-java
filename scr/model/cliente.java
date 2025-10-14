package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String donoNome;
    private String telefone;
    private String endereco;
    private int idDonoAnimal;

    private List<Animal> animais = new ArrayList<>();

    public Cliente(String donoNome, String telefone, String endereco, int idDonoAnimal) {
        this.donoNome = donoNome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idDonoAnimal = idDonoAnimal;
    }

    public String getDonoNome() {
        return this.donoNome;
    }

    public void setDonoNome(String donoNome) {
        this.donoNome = donoNome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getIdDonoAnimal() {
        return this.idDonoAnimal;
    }

    public void setIdDonoAnimal(int idDonoAnimal) {
        this.idDonoAnimal = idDonoAnimal;
    }
    
    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
        animal.setDono(this);
    }
    public List<Animal> getAnimais() {
        return this.animais;
    }
}
