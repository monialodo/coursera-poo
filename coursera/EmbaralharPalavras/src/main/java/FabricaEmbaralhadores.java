import interfaces.Embaralhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores{
    private final List<Embaralhador> embaralhadores;
    private final Random random;

    public FabricaEmbaralhadores() {
        embaralhadores = new ArrayList<>();
        embaralhadores.add(new EmbaralhadorInvertido());
        embaralhadores.add(new EmbaralhadorAleatorio());
        random = new Random();
    }

    public Embaralhador getEmbaralhadorAleatorio() {
        int index = random.nextInt(embaralhadores.size());
        return embaralhadores.get(index);
    }
}
