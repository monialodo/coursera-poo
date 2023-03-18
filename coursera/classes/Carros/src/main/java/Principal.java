public class Principal {
    public static void main(String[] args) {

        Corrida corridaDaAmizade = new Corrida(2000);
        corridaDaAmizade.adicionarCarro(new CarroSoma("Fusca", 10, 110));
        corridaDaAmizade.adicionarCarro(new CarroSoma("Brasilia", 8, 150));
        corridaDaAmizade.adicionarCarro(new CarroMult("Ferrari", 1.7, 100));
        corridaDaAmizade.adicionarCarro(new CarroMult("Porsche", 1.4, 110));

        corridaDaAmizade.umDoisTresEJa();


    }
}
