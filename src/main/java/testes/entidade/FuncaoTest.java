package testes.entidade;

import entidades.Funcao;

import static org.junit.jupiter.api.Assertions.*;

class FuncaoTest {

    @org.junit.jupiter.api.Test
    void setFuncao () {

        String nomeFuncao = "Operador";
        float salario = 1000.00f;
        Funcao funcao = new Funcao();

        funcao.setFuncao(nomeFuncao, salario);

        assertEquals(nomeFuncao.toUpperCase(), funcao.getNome());
        assertEquals(salario, funcao.getSalario());

    }

}