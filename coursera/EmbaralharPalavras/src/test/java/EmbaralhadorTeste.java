import interfaces.Embaralhador;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class EmbaralhadorTeste {
    @Test
    public void testeEmbaralhadorInvertido() {
        EmbaralhadorInvertido embaralhador = new EmbaralhadorInvertido();
        String palavraOriginal = "teste";
        String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);
        assertEquals("etset", palavraEmbaralhada);
        assertNotEquals(palavraOriginal, palavraEmbaralhada);
        assertEquals("avaj", embaralhador.embaralhar("java"));
        assertEquals("anairam", embaralhador.embaralhar("mariana"));
    }

    @Test
    public void testeEmbaralhadorAleatorio() {
        EmbaralhadorAleatorio embaralhador = new EmbaralhadorAleatorio();
        String palavraOriginal = "teste";
        String palavra = "palavra";
        String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);
        assertNotEquals(palavraOriginal, palavraEmbaralhada);
        String embaralhada = embaralhador.embaralhar(palavra);
        assertNotEquals(palavra, embaralhada);
    }

    @Test
    public void testeFabricaEmbaralhadores() {
        FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
        Set<Class<? extends Embaralhador>> classes = new HashSet<>();
        classes.add(EmbaralhadorInvertido.class);
        classes.add(EmbaralhadorAleatorio.class);
        for (int i = 0; i < 10; i++) {
            Embaralhador embaralhador = fabrica.getEmbaralhadorAleatorio();
            assertNotNull(embaralhador);
            assertTrue(classes.contains(embaralhador.getClass()));
        }
    }

}
