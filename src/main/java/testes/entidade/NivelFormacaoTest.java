package testes.entidade;

import entidades.NivelFormacao;

import static org.junit.jupiter.api.Assertions.*;

class NivelFormacaoTest {

    @org.junit.jupiter.api.Test
    void setNivelFormacaoValido () {

        Integer codNivelFormacao = 2;
        String nivelFormacaoTeste = "2º Grau (Ensino Médio)";
        NivelFormacao nivelFormacao = new NivelFormacao();

        nivelFormacao.setNivelFormacao(codNivelFormacao, nivelFormacaoTeste);

        assertEquals(codNivelFormacao, nivelFormacao.getCod());
        assertEquals(nivelFormacaoTeste.toUpperCase(), nivelFormacao.getNivel());

    }

}