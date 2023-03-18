import interfaces.MecanicaDoJogo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FabricaMecanicaDoJogo {
    private static final int JOGO_FACIL = 1;
    private static final int JOGO_DIFICIL = 2;

    public MecanicaDoJogo getMecanicaDoJogo() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o modo de jogo: \n1 - Fácil \n2 - Difícil");
        int opcao = sc.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas palavras deseja embaralhar?");
        int quantidadePalavras = scanner.nextInt();

        String caminhoArquivo = "D:\\Outros\\coursera\\EmbaralharPalavras\\palavras.txt";

        switch (opcao) {
            case JOGO_FACIL:
                return new MecanicaDoJogoFacil(new BancoDePalavras(new File(caminhoArquivo)), new FabricaEmbaralhadores(), quantidadePalavras);
            case JOGO_DIFICIL:
                return new MecanicaDoJogoDificil(new BancoDePalavras(new File(caminhoArquivo)), new FabricaEmbaralhadores(), quantidadePalavras);
            default:
                System.out.println("Opção inválida, escolha novamente.");
                return getMecanicaDoJogo();
        }
    }
}
