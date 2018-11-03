package testes.entidade;

import entidades.FuncaoApoio;

import static org.junit.jupiter.api.Assertions.*;

class FuncaoApoioTest {

    @org.junit.jupiter.api.Test
    void setFuncaoApoio () {

        String nomeFuncao = "Secretária";
        float salario = 1050.00f;
        float valeTransporte = 300.00f;
        FuncaoApoio funcaoApoio = new FuncaoApoio();

        funcaoApoio.setFuncaoApoio(nomeFuncao, salario, valeTransporte);

        assertEquals(nomeFuncao.toUpperCase(), funcaoApoio.getNome());
        assertEquals(salario, funcaoApoio.getSalario());
        assertEquals(valeTransporte, funcaoApoio.getValorValeTransporte());

    }

}