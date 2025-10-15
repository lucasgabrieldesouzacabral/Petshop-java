
public class Produto extends Item {
    private int idProduto;
   private String descricao;
   private Animal animal;
   private Funcionario funcionario;

    public Produto(int idProduto, String nomeItem, double precoItem, String descricao, Animal animal, Funcionario funcionario) {
        super(nomeItem, precoItem);
        this.descricao = descricao;
        this.animal = animal;
        this.funcionario = funcionario;
        this.idProduto = idProduto;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }

}