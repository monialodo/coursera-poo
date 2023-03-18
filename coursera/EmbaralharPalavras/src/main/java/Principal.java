import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();

        MecanicaDoJogo mecanicaDoJogo = fabricaMecanicaDoJogo.getMecanicaDoJogo();

        Embaralhador embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();

        File arquivo = new File("D:\\Outros\\coursera\\EmbaralharPalavras\\palavras.txt");
        BancoDePalavras bancoDePalavras = new BancoDePalavras(arquivo);

        while (!mecanicaDoJogo.fimDeJogo()) {

            String novaPalavra = mecanicaDoJogo.proximaPalavra(bancoDePalavras.getPalavraAleatoria());

            String palavraEmbaralhada = embaralhador.embaralhar(novaPalavra);

            System.out.println("Tente adivinhar a palavra: " + palavraEmbaralhada);
            String tentativa = scanner.next();

            if (mecanicaDoJogo.acertou(tentativa, novaPalavra)) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Ops, você errou.");
            }
            System.out.println("Pontuação atual: " + mecanicaDoJogo.pontuacao());
            System.out.println("Suas tentativas: " + mecanicaDoJogo.tentativasRestantes());
            System.out.println();
        }

        System.out.println("Fim de jogo! Sua pontuação final foi: " + mecanicaDoJogo.pontuacao());
        scanner.close();

    }
}
