import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        if (produto instanceof ProdutoComTamanho) {
            carrinho.put((ProdutoComTamanho) produto, quantidade);
        } else {
            if (carrinho.containsKey(produto)) {
                carrinho.put(produto, carrinho.get(produto) + quantidade);
            } else {
                carrinho.put(produto, quantidade);
            }
        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (produto instanceof ProdutoComTamanho) {
            carrinho.remove((ProdutoComTamanho) produto, quantidade);
        } else {
            if (carrinho.containsKey(produto)) {
                int novaQuantidade = carrinho.get(produto) - quantidade;
                if (novaQuantidade > 0) {
                    carrinho.put(produto, novaQuantidade);
                } else {
                    carrinho.remove(produto);
                }
            }
        }
    }

    public double calculaValorTotal() {
        double valorTotal = 0;
        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
            valorTotal += entry.getKey().getPreco() * entry.getValue();
        }
        return valorTotal;
    }
}
