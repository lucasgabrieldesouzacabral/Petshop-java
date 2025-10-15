package model;

public class Item {
    private int idItem;
    private String nomeItem;
    private double precoItem;

    public Item(int idItem, String nomeItem, double precoItem) {
        this.idItem = idItem;
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
    }

    
    public int getidItem() { 
        return idItem; 
    }
    public void setIdItem(int idItem) { 
        this.idItem = idItem; 
    }
    
    public String getnomeItem() { 
        return nomeItem; 
    }
    public void setNomeItem(String nomeItem) { 
        this.nomeItem = nomeItem; 
    }
    
    public double getprecoItem() { 
        return precoItem; 
    }
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem; 
    }
}