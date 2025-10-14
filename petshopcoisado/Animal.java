
public class Animal {
    private int idAnimal;
    private String nomeAnimal;
    private int idadeAnimal;
    private String especieAnimal;
    private String racaAnimal;
    private Cliente dono;
    private double pesoAnimal;

    public Animal(int idAnimal, String nomeAnimal, int idadeAnimal, String especieAnimal, String racaAnimal, Cliente dono, double pesoAnimal) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.especieAnimal = especieAnimal;
        this.racaAnimal = racaAnimal;
        this.dono = dono;
        this.pesoAnimal = pesoAnimal;
    }

    // Getters e Setters
    public int getIdAnimal() { return idAnimal; }
    public void setIdAnimal(int idAnimal) { this.idAnimal = idAnimal; }
    
    public String getNomeAnimal() { return nomeAnimal; }
    public void setNomeAnimal(String nomeAnimal) { this.nomeAnimal = nomeAnimal; }
    
    public int getIdadeAnimal() { return idadeAnimal; }
    public void setIdadeAnimal(int idadeAnimal) { this.idadeAnimal = idadeAnimal; }
    
    public String getEspecieAnimal() { return especieAnimal; }
    public void setEspecieAnimal(String especieAnimal) { this.especieAnimal = especieAnimal; }
    
    public String getRacaAnimal() { return racaAnimal; }
    public void setRacaAnimal(String racaAnimal) { this.racaAnimal = racaAnimal; }
    
    public Cliente getDono() { return dono; }
    public void setDono(Cliente dono) { this.dono = dono; }
    
    public double getPesoAnimal() { return pesoAnimal; }
    public void setPesoAnimal(double pesoAnimal) { this.pesoAnimal = pesoAnimal; }
    
    public int getIdDono() { return dono != null ? dono.getIdDonoAnimal() : 0; }
}
