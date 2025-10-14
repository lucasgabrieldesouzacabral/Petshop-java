package model;

public class Produto extends Item{

    public Produto(int idItem, String nomeItem, double precoItem) {
        super(idItem, nomeItem, precoItem);
    }

    // --------------------------------------------
    public int getIdItem() {
        return super.getIdItem();
    }
    public void setIdItem(int idItem) {
        super.setIdItem(idItem);
    }
    // --------------------------------------------
    public String getNomeItem() {
        return super.getNomeItem();
    }
    public void setNomeItem(String nomeItem) {
        super.setNomeItem(nomeItem);
    }
    // --------------------------------------------
    public double getPrecoItem() {
        return super.getPrecoItem();
    }
    public void setPrecoItem(double precoItem) {
        super.setPrecoItem(precoItem);
    }
}
