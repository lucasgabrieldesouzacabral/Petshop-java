package model;

public class Servico extends Item{
    private String servicoHorario;

    public Servico(int idItem, String nomeItem, double precoItem, String servicoHorario) {
        super(idItem, nomeItem, precoItem);
        this.servicoHorario = servicoHorario;
    
    }
    public String getServicoHorario() {
        return servicoHorario;
    }
    public void setServicoHorario(String servicoHorario) {
        this.servicoHorario = servicoHorario;
    }
    public String getNomeItem() {
        return super.getNomeItem();
    }
    public void setNomeItem(String nomeItem) {
        super.setNomeItem(nomeItem);
    }
    public double getPrecoItem() {
        return super.getPrecoItem();
    }
    public void setPrecoItem(double precoItem) {
        super.setPrecoItem(precoItem);
    }
    public int getIdItem() {
        return super.getIdItem();
    }
    public void setIdItem(int idItem) {
        super.setIdItem(idItem);
    }
}
