package model;

public class Produto extends Item{
    private String descricaoProduto;


    public Produto(int idItem, String nomeItem, double precoItem, String descricaoProduto) {
        super(idItem, nomeItem, precoItem);
        this.descricaoProduto = descricaoProduto;
    }

    public int getIdItem() {
        return super.getidItem();
    }
    public void setIdItem(int idItem) {
        super.setIdItem(idItem);
    }
    public String getNomeItem() {
        return super.getnomeItem();
    }
    public void setNomeItem(String nomeItem) {
        super.setNomeItem(nomeItem);
    }
    public double getPrecoItem() {
        return super.getprecoItem();
    }
    public void setPrecoItem(double precoItem) {
        super.setPrecoItem(precoItem);
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
}
