package model;

public class Animal{
    private int idAnimal;
    private String nomeAnimal;
    private int idadeAnimal;
    private String tipoAnimal;
    private String especieAnimal;
    private Cliente dono;

     public Animal(int idAnimal, String nomeAnimal, int idadeAnimal, String tipoAnimal, String especieAnimal, Cliente dono) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.especieAnimal = especieAnimal;
        this.dono = dono;
    }

   // --------------------------------------------
    public int getIdAnimal() {
        return this.idAnimal;
    }
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }
    // --------------------------------------------
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    // --------------------------------------------
    public int getIdadeAnimal() {
        return this.idadeAnimal;
    }
    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
    // --------------------------------------------
    public String getTipoAnimal() {
        return this.tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    // --------------------------------------------
    public String getEspecieAnimal() {
        return this.especieAnimal;
    }
    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }
    // --------------------------------------------
    public Cliente getDono() {
        return this.dono;
    }
    public void setDono(Cliente dono) {
        this.dono = dono;
    }

}
