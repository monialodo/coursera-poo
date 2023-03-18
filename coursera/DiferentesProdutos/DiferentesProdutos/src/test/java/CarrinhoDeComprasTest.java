import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {
    @Test
    public void testAdicionaProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Notebook", "12345", 2500.00);
        Produto produto2 = new Produto("Celular", "67890", 1500.00);
        Produto produto3 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "P");
        Produto produto4 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "M");
        Produto produto5 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "G");


        // Adiciona produtos ao carrinho
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);
        carrinho.adicionaProduto(produto3, 3);
        carrinho.adicionaProduto(produto4, 1);

        // Verifica o conteúdo do carrinho
        assertEquals(carrinho.calculaValorTotal(), 2 * 2500.00 + 1 * 1500.00 + 3 * 50.00 + 1 * 50.00);

        // Adiciona mais produtos ao carrinho
        carrinho.adicionaProduto(produto1, 1);
        carrinho.adicionaProduto(produto5, 2);

        // Verifica o conteúdo do carrinho
        assertEquals(carrinho.calculaValorTotal(), 3 * 2500.00 + 1 * 1500.00 + 5 * 50.00 + 1 * 50.00);
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Notebook", "12345", 2500.00);
        Produto produto2 = new Produto("Celular", "67890", 1500.00);
        Produto produto3 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "P");
        Produto produto4 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "M");
        Produto produto5 = new ProdutoComTamanho("Camiseta", "24680", 50.00, "G");


        // Adiciona produtos ao carrinho
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);
        carrinho.adicionaProduto(produto3, 2);
        carrinho.adicionaProduto(produto4, 1);


        // Remove produtos do carrinho
        carrinho.removeProduto(produto1, 1);
        carrinho.removeProduto(produto3, 2);

        // Verifica o conteúdo do carrinho
        assertEquals(carrinho.calculaValorTotal(), 1 * 2500.00 + 1 * 1500.00 + 1 * 50.00);

        // Remove mais produtos do carrinho
        carrinho.removeProduto(produto1, 1);
        carrinho.removeProduto(produto4, 1);

        // Verifica o conteúdo do carrinho
        assertEquals(carrinho.calculaValorTotal(), 1 * 1500.00 );
    }
}