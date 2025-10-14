package model;

public class Conta {
    private double pagamento;
    private int idCompra;
    private Funcionario atendente;

    public Conta(double pagamento, int idCompra, Funcionario atendente) {
        this.pagamento = pagamento;
        this.idCompra = idCompra;
        this.atendente = atendente;
    }
    // --------------------------------------------
    public double getPagamento() {
        return pagamento;
    }
    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }
    // --------------------------------------------
    public int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    // --------------------------------------------
    public Funcionario getAtendente() {
        return atendente;
    }
    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }
}