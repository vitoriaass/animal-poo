public class animal {
    private String nome;
    private float comprimento;
    private int numerodepatas;
    private String cor;
    private String ambiente;
    private float velocidademedia;

    public Animal(String nome, float comprimento, int numerodepatas, String cor, String ambiente);
        this.nome =nome;
        this.comprimento =comprimento;
        this.numerodepatas =numerodepatas;
        this.cor =cor;
        this.ambiente =ambiente;
        this.velocidademedia =velocidademedia;

}
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    public void setNumerodepatas(int numerodepatas) {
        this.nome = nome;
    }
    public void setCor(String cor) {
    this.cor = cor;
    }
    public void setAmbiente(String ambiente){
    this.ambiente = ambiente;
    }
    public void setVelocidademedia(float velocidademedia){
    this.velocidademedia = velocidademedia;
    }

    public void dados(){
        System.out.println("nome:" + nome);
        System.out.println("comprimento:" + comprimento);
        System.out.println("numerodepatas:" + numerodepatas);
        System.out.println("cor:" + cor);
        System.out.println("ambiente:" + ambiente);
        System.out.println("velocidademedia:" + velocidademedia);
    }