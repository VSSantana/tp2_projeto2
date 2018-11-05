package testes.entidade;

import entidades.CursoEmpregado;

import static org.junit.jupiter.api.Assertions.*;

class CursoEmpregadoTest {

    @org.junit.jupiter.api.Test
    void setCursoEmpregadoValido () {

        Integer cod = 4;
        Integer codEmpregado = 14;
        Integer codCurso = 2;
        CursoEmpregado cursoEmpregado = new CursoEmpregado();

        cursoEmpregado.setCursoEmpregado(cod, codEmpregado, codCurso);

        assertEquals(cod,cursoEmpregado.getCod());
        assertEquals(codEmpregado,cursoEmpregado.getCodEmpregado());
        assertEquals(codCurso,cursoEmpregado.getCodCurso());

    }

}