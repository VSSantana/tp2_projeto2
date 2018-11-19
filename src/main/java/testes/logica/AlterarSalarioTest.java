package testes.logica;

import database.ConnectSQLiteDatabase;
import database.Query;
import entidades.TipoEmpregado;
import logica.AlterarSalario;

import static org.junit.jupiter.api.Assertions.*;

class AlterarSalarioTest {

    @org.junit.jupiter.api.Test
    void alterarBonus () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Query consulta = new Query(connectSQLiteDatabase.dbConnect());
        int vCodDiretorSetor = consulta.retornaCodTipoEmpregado("DIRETOR DE SETOR");
        TipoEmpregado tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vCodDiretorSetor);
        float salarioAtual = tipoEmpregado.getSalario();

        consulta.closeConnection();

        AlterarSalario alterarSalario = new AlterarSalario(connectSQLiteDatabase.dbConnect());

        alterarSalario.alterarSalario("DIRETOR DE SETOR", 1500);

        alterarSalario.closeConnection();

        consulta = new Query(connectSQLiteDatabase.dbConnect());

        tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vCodDiretorSetor);
        float salarioAlterado = tipoEmpregado.getSalario();

        consulta.closeConnection();

        alterarSalario = new AlterarSalario(connectSQLiteDatabase.dbConnect());

        alterarSalario.alterarSalario("DIRETOR DE SETOR", salarioAtual);

        alterarSalario.closeConnection();

        assertTrue(salarioAtual > salarioAlterado);

    }

}