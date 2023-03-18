import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;

import java.util.ArrayList;
import java.util.List;

public class MecanicaDoJogoDificil implements MecanicaDoJogo {
    private final BancoDePalavras bancoDePalavras;
    private final List<String> palavrasUsadas;
    private int tentativasRestantes;
    private int pontuacao;
    private final int quantidadePalavras;

    public MecanicaDoJogoDificil(BancoDePalavras bancoDePalavras, FabricaEmbaralhadores fabricaEmbaralhadores, int quantidadePalavras) {
        this.bancoDePalavras = bancoDePalavras;
        Embaralhador embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();
        this.pontuacao = 0;
        this.tentativasRestantes = 1;
        this.quantidadePalavras = quantidadePalavras;
        this.palavrasUsadas = new ArrayList<>();
    }

    @Override
    public boolean fimDeJogo() {
        return (palavrasUsadas.size() == quantidadePalavras || tentativasRestantes == 0);
    }

    @Override
    public String proximaPalavra(String novaPalavra) {
        this.tentativasRestantes = 1;
        String palavra = novaPalavra;
        while (palavrasUsadas.contains(palavra)) {
            palavra = bancoDePalavras.getPalavraAleatoria();
        }
        palavrasUsadas.add(palavra);
        return palavra;
    }

    @Override
    public boolean acertou(String palavra, String palavraAleatoria) {
        if (palavra.equalsIgnoreCase(palavraAleatoria)) {
            this.pontuacao += 3;
            fimDeJogo();
            return true;
        } else {
            this.tentativasRestantes--;
            fimDeJogo();
            return false;
        }
    }

    @Override
    public int pontuacao() {
        return this.pontuacao;
    }

    @Override
    public int tentativasRestantes() {
        return this.tentativasRestantes;
    }
}
