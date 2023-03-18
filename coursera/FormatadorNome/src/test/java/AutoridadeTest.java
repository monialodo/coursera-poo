import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoridadeTest {

    @Test
    public void getTratamentoComFormatadorInformal() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Informal());
        assertEquals("João", autoridade.getTratamento());
    }

    @Test
    public void getTratamentoComFormatadorRespeitosoMasculino() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Respeitoso("masculino"));
        assertEquals("Sr. Silva", autoridade.getTratamento());
    }

    @Test
    public void getTratamentoComFormatadorRespeitosoFeminino() {
        Autoridade autoridade = new Autoridade("Maria", "Silva", new Respeitoso("feminino"));
        assertEquals("Sra. Silva", autoridade.getTratamento());
    }

    @Test
    public void getTratamentoComFormatadorComTitulo() {
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", new ComTitulo("Magnífico"));
        assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
    }
}
