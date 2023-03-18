import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TesteCarroSoma {

    CarrodeCorrida c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroSoma(
                "Fusca",
                10,
                100
        );
    }

    @Test
    void carroParado() {
        assertEquals(0, c.getVelocidade());
    }

    @Test
    void acelerar() {
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    void acelerarEFrear() {
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void frearAteZero() {
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void acelerarAteVelocidadeMaxima() {
        for (int i = 0; i < 14; i++) {
            c.acelerar();
        }
        assertEquals(100, c.getVelocidade());
    }




    @Test
    void getVelocidade() {
    }

    @Test
    void imprimir() {
    }
}