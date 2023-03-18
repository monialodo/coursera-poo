import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest {


    @BeforeClass
    public static void zeraRegistroIngredientes() {
        Pizza.ingredientes.clear();
    }

    @Test
    public void testZeraRegistroIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        Pizza.ingredientes.clear();
        assertEquals(0, Pizza.ingredientes.size());
    }

    @Test
    public void testAdicionaIngrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("cebola");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("queijo");
        assertEquals(1, Pizza.ingredientes.get("cebola").intValue());
        assertEquals(2, Pizza.ingredientes.get("tomate").intValue());
        assertEquals(3, Pizza.ingredientes.get("queijo").intValue());
    }

    @Test
    public void testPreco1Ingrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        assertEquals(15, pizza.getPreco());
    }


    @Test
    public void testPreco4Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("cebola");
        pizza.adicionaIngrediente("azeitona");
        assertEquals(20, pizza.getPreco());
    }


    @Test
    public void testPreco8Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("cebola");
        pizza.adicionaIngrediente("azeitona");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("calabresa");
        pizza.adicionaIngrediente("pimentão");
        pizza.adicionaIngrediente("azeitona");
        assertEquals(23, pizza.getPreco());
    }


}
