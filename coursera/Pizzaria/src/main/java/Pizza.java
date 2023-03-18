import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pizza {

    static Map <String,Integer> ingredientes = new HashMap<String, Integer>();
    List<String> ingredientesDaPizza = new ArrayList<>();


    public void adicionaIngrediente(String ingrediente) {
            ingredientesDaPizza.add(ingrediente);
            contabilizaIngrediente(ingrediente);
    }

    public static void contabilizaIngrediente(String ingrediente) {
        ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
    }

    public int getPreco() {

        int numIngredientes = ingredientesDaPizza.size();

        if (numIngredientes <= 2) {
            return  15;
        } else if (numIngredientes <= 5) {
            return  20;
        } else  {
            return  23;
        }
    }


public static void ListarIngredientes(){
        for (String ingrediente : ingredientes.keySet()) {
            System.out.println(ingrediente + " - " + ingredientes.get(ingrediente));
        }
    }

}
