public class Respeitoso implements FormatadorNome {
    private String genero;

    public Respeitoso(String genero) {
        this.genero = genero;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if (genero.equalsIgnoreCase("masculino")) {
            return "Sr. " + sobrenome;
        } else if (genero.equalsIgnoreCase("feminino")) {
            return "Sra. " + sobrenome;
        }
        return sobrenome;
    }
}
