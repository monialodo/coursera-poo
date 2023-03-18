import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCarroMult {

    CarrodeCorrida c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroMult(
                "Fusca",
                1.5,
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
        assertEquals(15, c.getVelocidade());
    }

    @Test
    void acelerarEFrear() {
        c.acelerar();
        c.frear();
        assertEquals(7, c.getVelocidade());
    }

    @Test
    void acelerarDuasVezes(){
        c.acelerar();
        c.acelerar();
        assertEquals(33, c.getVelocidade());
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
