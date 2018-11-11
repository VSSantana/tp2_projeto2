package testes.logica;

import database.ConnectSQLiteDatabase;
import database.Delete;
import database.Query;
import logica.CadastrarEmpregado;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarEmpregadoTest {

    @org.junit.jupiter.api.Test
    void cadastrarEmpregado () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        int vRetorno;
        String pNome = "Jair Messias Bolsonaro";
        int pIdade = 63;
        String pCpf = "67536138466";
        Date pDataNascimento = Date.valueOf("1955-03-21");
        String pNivelFormacao = "3º GRAU (ENSINO SUPERIOR)";
        String pCurso = "ECONOMIA";
        String pTipoEmpregado = "PROFISSIONAL";
        String pSetor = "FINANÇAS";
        Date pDataAdmissao = Date.valueOf("2019-01-01");
        CadastrarEmpregado cadastrarEmpregado = new CadastrarEmpregado(connectSQLiteDatabase.dbConnect());
        Delete delete = new Delete(connectSQLiteDatabase.dbConnect());

        vRetorno = cadastrarEmpregado.cadastrarNovoEmpregado(pNome,
                                                             pIdade,
                                                             pCpf,
                                                             pDataNascimento,
                                                             pNivelFormacao,
                                                             pCurso,
                                                             pTipoEmpregado,
                                                             pSetor,
                                                             pDataAdmissao);

        assertTrue(vRetorno > 0);

        delete.apagarEmpregado(vRetorno);

        delete.closeConnection();

    }

}