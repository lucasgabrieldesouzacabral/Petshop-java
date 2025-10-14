package model;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nomeFuncionario;
    private String funcao;
    private List<Animal> animaisAtendidos;

    public Funcionario(String nomeFuncionario, String funcao) {
        this.nomeFuncionario = nomeFuncionario;
        this.funcao = funcao;
        this.animaisAtendidos = new ArrayList<>();
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public List<Animal> getAnimaisAtendidos() {
        return animaisAtendidos;
    }
    public void setAnimaisAtendidos(List<Animal> animaisAtendidos) {
        this.animaisAtendidos = animaisAtendidos;
    }
    public void adicionarAnimalAtendido(Animal animal) {
        this.animaisAtendidos.add(animal);
    }
}