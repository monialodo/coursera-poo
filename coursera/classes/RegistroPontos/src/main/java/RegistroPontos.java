public class RegistroPontos {

    private CalculadoraBonus bonus;

    public RegistroPontos(CalculadoraBonus cb) {
        bonus = cb;
    }

    void fazerUmComentario (Usuario u) {
        u.pontos += 3 * bonus.bonus(u);
    }

    void criarUmTopico (Usuario u) {
            u.pontos += 5 * bonus.bonus(u);
    }

    void darLike (Usuario u) {
        u.pontos += bonus.bonus(u);
    }





}
