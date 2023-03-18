import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoComTamanhoTest {
    @Test
    public void testEqualsHashCode() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", "12345", 50.00, "P");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", "12345", 50.00, "M");
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Camiseta", "67890", 60.00, "P");
        ProdutoComTamanho produto4 = new ProdutoComTamanho("Camiseta", "12345", 50.00, "P");

        // Teste equals
        assertTrue(produto1.equals(produto1));
        assertFalse(produto1.equals(produto2));
        assertFalse(produto1.equals(produto3));
        assertTrue(produto1.equals(produto4));

        // Teste hashCode
        assertEquals(produto1.hashCode(), produto1.hashCode());
        assertNotEquals(produto1.hashCode(), produto2.hashCode());
        assertNotEquals(produto1.hashCode(), produto3.hashCode());
        assertEquals(produto1.hashCode(), produto4.hashCode());
    }
}
