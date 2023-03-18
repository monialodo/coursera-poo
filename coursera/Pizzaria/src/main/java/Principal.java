public class Principal {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("oregano");
        pizza2.adicionaIngrediente("frango");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("calabresa");
        pizza3.adicionaIngrediente("cebola");
        pizza3.adicionaIngrediente("azeitona");
        pizza3.adicionaIngrediente("milho");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        System.out.println("Valor total do carrinho: " + carrinho.getValorTotal());
        Pizza.ListarIngredientes();


    }
}
