import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteRegistroPontos {

    @Test
    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "João";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos r = new RegistroPontos(cb);
        r.criarUmTopico(u);
        assertEquals(5,u.pontos);
    }


    @Test
    public void pontosCriarTopicoVip() {
        Usuario u = new Usuario();
        u.nome = "João";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos r = new RegistroPontos(cb);
        r.criarUmTopico(u);
        assertEquals(25,u.pontos);
    }

    @Test
    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "João";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos r = new RegistroPontos(cb);
        r.criarUmTopico(u);
        assertEquals(15,u.pontos);
    }

    @Test
    public void pontosCriarTopicoVipBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "João";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos r = new RegistroPontos(cb);
        r.criarUmTopico(u);
        assertEquals(50,u.pontos);
    }

}