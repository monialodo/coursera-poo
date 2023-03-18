import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
    private final ArrayList<String> palavras;

    public BancoDePalavras(File arquivo) throws IOException {
        palavras = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                palavras.add(linha);
            }
        } catch (IOException e) {
            throw new IOException("Erro ao ler o arquivo " + arquivo.getName());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public String getPalavraAleatoria() {
        Random rand = new Random();
        int indice = rand.nextInt(palavras.size());
        return palavras.get(indice);
    }
}
