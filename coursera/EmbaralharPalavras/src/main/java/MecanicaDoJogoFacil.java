import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;

import java.util.ArrayList;

public class MecanicaDoJogoFacil implements MecanicaDoJogo {
    private final BancoDePalavras bancoDePalavras;
    private final ArrayList<String> palavrasUsadas;
    private int tentativas;
    private int pontuacao;
    private final int quantidadePalavras;

    public MecanicaDoJogoFacil(BancoDePalavras bancoDePalavras, FabricaEmbaralhadores fabricaEmbaralhadores, int quantidadePalavras) {
        this.bancoDePalavras = bancoDePalavras;
        this.palavrasUsadas = new ArrayList<>();
        this.tentativas = 3;
        this.pontuacao = 0;
        this.quantidadePalavras = quantidadePalavras;
    }

    public boolean fimDeJogo() {
        return (palavrasUsadas.size() == quantidadePalavras || tentativas == 0);
    }

    public String proximaPalavra(String novaPalavra) {
        String palavra = novaPalavra;
        while (palavrasUsadas.contains(palavra)) {
            palavra = bancoDePalavras.getPalavraAleatoria();
        }
        palavrasUsadas.add(palavra);
        return palavra;
    }

    public boolean acertou(String palavra, String palavraAleatoria) {

        if (palavra.equalsIgnoreCase(palavraAleatoria)) {
            pontuacao += 10 * tentativas;
            fimDeJogo();
            return true;
        } else {
            tentativas--;
            fimDeJogo();
            return false;
        }
    }

    public int pontuacao() {
        return pontuacao;
    }

    public int tentativasRestantes() {
        return tentativas;
    }

}
