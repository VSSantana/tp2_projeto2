package testes.logica;

import database.ConnectSQLiteDatabase;
import database.Query;
import entidades.TipoEmpregado;
import logica.AlterarBonusDiretor;

import static org.junit.jupiter.api.Assertions.*;

class AlterarBonusDiretorTest {


    @org.junit.jupiter.api.Test
    void alterarBonus () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Query consulta = new Query(connectSQLiteDatabase.dbConnect());
        int vCodDiretorSetor = consulta.retornaCodTipoEmpregado("DIRETOR DE SETOR");
        TipoEmpregado tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vCodDiretorSetor);
        int porcentagemAtual = tipoEmpregado.getPorcentagemBonus();

        consulta.closeConnection();

        AlterarBonusDiretor alterarBonusDiretor = new AlterarBonusDiretor(connectSQLiteDatabase.dbConnect());

        alterarBonusDiretor.alterarBonusDiretor("DIRETOR DE SETOR", 7);

        alterarBonusDiretor.closeConnection();

        consulta = new Query(connectSQLiteDatabase.dbConnect());

        tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vCodDiretorSetor);
        int porcentagemAlterada = tipoEmpregado.getPorcentagemBonus();

        consulta.closeConnection();

        alterarBonusDiretor = new AlterarBonusDiretor(connectSQLiteDatabase.dbConnect());

        alterarBonusDiretor.alterarBonusDiretor("DIRETOR DE SETOR", 2);

        alterarBonusDiretor.closeConnection();

        assertTrue(porcentagemAtual < porcentagemAlterada);

    }



}