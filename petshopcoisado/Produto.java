
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;

    public Produto(int idProduto, String nomeProduto, double precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public int getidItem() { return idProduto; }
    public String getnomeItem() { return nomeProduto; }
    public double getprecoItem() { return precoProduto; }
}