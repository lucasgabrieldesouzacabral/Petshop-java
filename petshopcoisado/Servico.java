
public class Servico {
    private int idServico;
    private Animal animal;
    private Funcionario funcionario;
    private Item item;
    private String servicoHorario;

    public Servico(int idServico, Animal animal, Funcionario funcionario, Item item, String servicoHorario) {
        this.idServico = idServico;
        this.animal = animal;
        this.funcionario = funcionario;
        this.item = item;
        this.servicoHorario = servicoHorario;
    }

    public String getservicoHorario() { return servicoHorario; }
    public int getidItem() { return item.getidItem(); }
    public String getnomeItem() { return item.getnomeItem(); }
    public double getprecoItem() { return item.getprecoItem(); }
}