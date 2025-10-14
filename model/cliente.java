package model;

import java.util.ArrayList;
import java.util.List;

public class cliente {
    private String donoNome;
    private String telefone;
    private String endereco;
    private int idDonoAnimal;
    private List<animal> animais;

    public cliente(String donoNome, String telefone, String endereco, int idDonoAnimal) {
        this.donoNome = donoNome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idDonoAnimal = idDonoAnimal;
        this.animais = new ArrayList<>();
    }
    
    public void adicionarAnimal(animal animal){
        animais.add(animal);
    }



    
}
