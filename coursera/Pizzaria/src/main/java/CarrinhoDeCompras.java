import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (!pizza.ingredientesDaPizza.isEmpty()) {
            pizzas.add(pizza);
        } else {
            System.out.println("Não é possível adicionar uma pizza sem ingredientes!");
        }
    }

    public int getValorTotal() {
        int valorTotal = 0;
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }


}
