
public abstract class CarrodeCorrida {

    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarrodeCorrida(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
    }

    public abstract void acelerar();

    public void frear() {
        velocidade = velocidade/2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }



}
