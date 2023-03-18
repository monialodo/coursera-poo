import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testEqualsHashCode() {
        Produto produto1 = new Produto("Notebook", "12345", 2500.00);
        Produto produto2 = new Produto("Celular", "12345", 1500.00);
        Produto produto3 = new Produto("TV", "67890", 3000.00);

        // Teste equals
        assertTrue(produto1.equals(produto2));
        assertFalse(produto1.equals(produto3));

        // Teste hashCode
        assertEquals(produto1.hashCode(), produto2.hashCode());
        assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }
}
