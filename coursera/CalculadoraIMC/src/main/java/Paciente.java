public class Paciente {

    String nome;
    double quilos;
    double altura;

    public Paciente(String nome, double quilos, double altura) {
        this.nome = nome;
        this.quilos = quilos;
        this.altura = altura;
    }

    public static double calcularIMC(double quilos, double altura) {
        return Math.round(quilos / (altura * altura));
    }

    public String diagnostico(double imc) {
        Diagnostico diagnostico;

        if (imc < 16.0) {
            diagnostico = Diagnostico.BAIXO_PESO_MUITO_GRAVE;
        } else if (imc >= 16.0 && imc < 16.99) {
            diagnostico = Diagnostico.BAIXO_PESO_GRAVE;
        } else if (imc >= 17.0 && imc < 18.49) {
            diagnostico = Diagnostico.BAIXO_PESO;
        } else if (imc >= 18.5 && imc < 24.99) {
            diagnostico = Diagnostico.PESO_NORMAL;
        } else if (imc >= 25.0 && imc < 29.99) {
            diagnostico = Diagnostico.SOBREPESO;
        } else if (imc >= 30.0 && imc < 34.99) {
            diagnostico = Diagnostico.OBESIDADE_GRAU_1;
        } else if (imc >= 35.0 && imc < 39.99) {
            diagnostico = Diagnostico.OBESIDADE_GRAU_2;
        } else {
            diagnostico = Diagnostico.OBESIDADE_GRAU_3;
        }

        return "O paciente " + nome + " está com IMC = " + imc + " - Diagnostico: " + diagnostico.getDescricao();
    }
}

