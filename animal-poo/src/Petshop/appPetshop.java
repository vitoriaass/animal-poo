package Petshop;



public class appPetshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Proprietario proprietario = new Proprietario();
        Proprietario p1 = new Proprietario();
        Proprietario p2 = new Proprietario();
        Gato gato = new Gato();
        Cavalo cavalo = new Cavalo();
        Rato rato = new Rato();


        proprietario.setNome("Israel");
        p1.setNome("Cássio");
        p2.setNome("João Lucas");


        cachorro.setNome("Dog");
        cachorro.setPeso(10.0);
        cachorro.setRaca("pincher");
        cachorro.setCor("preto");
        cachorro.setProprietario(p1);

        gato.setNome("Pipoca");
        gato.setPeso(5.0);
        gato.setRaca("persa");
        gato.setCor("branco");
        gato.setProprietario(proprietario);

        cavalo.setNome("Spike");
        cavalo.setPeso(50.0);
        cavalo.setRaca("pampa");
        cavalo.setCor("marrom");
        cavalo.setProprietario(p2);

        rato.setNome("Matheus");
        rato.setPeso(1.0);
        rato.setRaca("Camundongo");
        rato.setCor("Amarelo");
        rato.setProprietario(proprietario);

        System.out.println("nome: " + cachorro.getNome() + " peso: " + cachorro.getPeso() + " raça: " + cachorro.getRaca() + " cor: " + cachorro.getCor() + " dono: " + cachorro.getProprietario().getNome());
        System.out.println("nome: " + gato.getNome() + " peso: " + gato.getPeso() + " raça: " + gato.getRaca() + " cor: " + gato.getCor() + " dono: " + gato.getProprietario().getNome());
        System.out.println("nome: " + cavalo.getNome() + " peso: " + cavalo.getPeso() + " raça: " + cavalo.getRaca() + " cor: " + cavalo.getCor() + " dono: " + cavalo.getProprietario().getNome());
        System.out.println("nome: " + rato.getNome() + " peso: " + rato.getPeso() + " raça: " + rato.getRaca() + " cor: " + rato.getCor() + " dono: " + rato.getProprietario().getNome());
    }
}
