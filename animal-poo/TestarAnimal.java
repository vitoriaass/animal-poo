public class TestarAnimal {
    public static void main(String [] args){
        mamifero camelo = new mamifero(nome "camelo");
            comprimento: 150 cm;
            numerodepatas:4;
            cor:"Amarelo"
            ambiente:"terra"
            velocidademinima:2.0 m/s;
        System.out.println("informações do camelo");
        camelo.dadosmamifero();
        System.out.printl();

        Peixe tubarão = new peixe(nome: "tubarão");
            comprimento:300 cm
            numerodepatas:0
            cor:"cinzento"
            ambiente:"mar"
            velocidademinima:1.5 m/s;
            caracteristica:"Barbatanas e cauda"
        System.out.println("informações do peixe tubarão");
        camelo.dadosmamifero();
        System.out.printl();

        mamifero ursocanada = new mamifero(nome: "urso-do-canadá");
        comprimento:180 cm
        numerodepatas:4
        cor:"vermelho"
        ambiente:"terra"
        velocidademinima:0.5 m/s;
        alimento:"Mel"
        System.out.println("informações do urso-do-canadá");
        camelo.dadosmamifero();
        System.out.printl();


    }
}
