public enum Diagnostico {

    BAIXO_PESO_MUITO_GRAVE("Baixo peso muito grave"),
    BAIXO_PESO_GRAVE("Baixo peso grave"),
    BAIXO_PESO("Baixo peso"),
    PESO_NORMAL("Peso normal"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_GRAU_1("Obesidade grau I"),
    OBESIDADE_GRAU_2("Obesidade grau II"),
    OBESIDADE_GRAU_3("Obesidade grau III");

    private String descricao;

    Diagnostico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
