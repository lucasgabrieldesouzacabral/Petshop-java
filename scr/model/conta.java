package model;

public class Conta {
    private double pagamento;
    private int idCompra;
    private Funcionario atendente;
    private Tipagamento tipoPagamento;

    public Conta(double pagamento, int idCompra, Funcionario atendente, Tipamento tipoPagamento) {
        this.pagamento = pagamento;
        this.idCompra = idCompra;
        this.atendente = atendente;
        this.tipoPagamento = tipoPagamento;
    }
   
    public double getPagamento() {
        return pagamento;
    }
    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }
    
    public int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    
    public Funcionario getAtendente() {
        return atendente;
    }
    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }
    public Tipagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(Tipagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}