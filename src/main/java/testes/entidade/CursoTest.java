package testes.entidade;

import entidades.Curso;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @org.junit.jupiter.api.Test
    void setCursoValido () {

        Integer codCurso = 77;
        String nomeCurso = "Administração";
        Curso curso = new Curso();

        curso.setCurso(codCurso, nomeCurso);

        assertEquals(codCurso, curso.getCod());
        assertEquals(nomeCurso.toUpperCase(), curso.getNomeCurso());

    }

}