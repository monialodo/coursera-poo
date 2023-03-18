public class Principal {

    public static void main(String[] args) {
            pacientesDiagnostico(new Paciente("joao", 80, 1.80));
            pacientesDiagnostico(new Paciente("Maria", 60, 1.70));
            pacientesDiagnostico(new Paciente("José", 110, 1.90));
        }

        private static void pacientesDiagnostico(Paciente paciente) {
            double imc = paciente.calcularIMC(
                    paciente.quilos,
                    paciente.altura
            );
            System.out.println(paciente.diagnostico(imc));
        }

}
