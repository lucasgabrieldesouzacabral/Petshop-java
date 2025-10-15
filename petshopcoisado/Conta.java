
public class Conta {
    private double pagamento;
    private int idCompra;
    private Funcionario atendente;
    private TipoPagamento tipoPagamento;
    private Animal animal;

    public Conta(double pagamento, int idCompra, Funcionario atendente, TipoPagamento tipoPagamento, Animal animal) {
        this.pagamento = pagamento;
        this.idCompra = idCompra;
        this.atendente = atendente;
        this.tipoPagamento = tipoPagamento;
        this.animal = animal;
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
       public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
}
