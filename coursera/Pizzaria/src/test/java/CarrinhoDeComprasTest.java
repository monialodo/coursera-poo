import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CarrinhoDeComprasTest {

    @Test
    void testAdicionaPizzaComIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        carrinho.adicionaPizza(pizza);
        assertEquals(15, carrinho.getValorTotal());
    }

    @Test
    void testAdicionaPizzaSemIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();
        carrinho.adicionaPizza(pizza);
        assertEquals(0, carrinho.getValorTotal());
    }

    @Test
    void testAdicionaDuasPizzasComIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Tomate");
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        assertEquals(30, carrinho.getValorTotal());
    }

    @Test
    void testAdicionaPizzaComMaisDeCincoIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Presunto");
        pizza.adicionaIngrediente("Ovo");
        pizza.adicionaIngrediente("Bacon");
        pizza.adicionaIngrediente("Cebola");
        carrinho.adicionaPizza(pizza);
        assertEquals(23, carrinho.getValorTotal());
    }




}