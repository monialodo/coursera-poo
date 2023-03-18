public class CarroMult extends CarrodeCorrida {

    private double potencia;

    public CarroMult(String nome, double potencia, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        if (potencia > 1 && potencia < 2) {
            this.potencia = potencia;
        } else {
            this.potencia = 1.5;
        }
    }

    public void acelerar() {
        if (velocidade == 0) {
            velocidade = 10;
        } else {
            velocidade *= potencia;
        }
        velocidade *= potencia;

        if (velocidade > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
        }
    }
}
