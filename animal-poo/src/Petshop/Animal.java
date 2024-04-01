package Petshop;

public class Animal {
    private String nome;
    private double peso;
    private String raca;
    private String cor;
    private Proprietario proprietario;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public Proprietario getProprietario(){
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario){
        this.proprietario = proprietario;
    }

}

