package interfaces;

public interface MecanicaDoJogo {
    boolean fimDeJogo();
    String proximaPalavra(String novaPalavra);
    boolean acertou(String palavra, String palavraAleatoria);
    int pontuacao();
    int tentativasRestantes();
}

