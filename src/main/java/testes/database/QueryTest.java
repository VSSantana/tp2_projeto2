package testes.database;

import database.ConnectSQLiteDatabase;
import database.Query;
import entidades.Curso;

import static org.junit.jupiter.api.Assertions.*;

class QueryTest {

    @org.junit.jupiter.api.Test
    void queryCurso () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Query query = new Query(connectSQLiteDatabase.dbConnect());
        Curso curso;

        curso = query.retornaRegistroCurso(1);

        Integer codCurso = curso.getCod();
        String nomeCurso = curso.getNomeCurso();

        assertEquals(codCurso, curso.getCod());
        assertEquals(nomeCurso, curso.getNomeCurso());

    }


}