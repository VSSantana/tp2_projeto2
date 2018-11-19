package testes.logica;

import database.ConnectSQLiteDatabase;
import logica.DadosColaborador;

import static org.junit.jupiter.api.Assertions.*;

class DadosColaboradorTest {

    @org.junit.jupiter.api.Test
    void recuperaDadosEmpregado () {

        ConnectSQLiteDatabase connection = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connection.dbConnect());

        dadosColaborador.recuperaDados(1);

        assertFalse(dadosColaborador.getNomeColaborador().isEmpty());
        assertTrue(dadosColaborador.getIdade() > 0);
        assertFalse(dadosColaborador.getCpf().isEmpty());
        assertFalse(dadosColaborador.getIdentificadorEmpresa().isEmpty());
        assertTrue(dadosColaborador.getDataNascimento() != null);
        assertFalse(dadosColaborador.getNivelFormacaoEmpregado().isEmpty());
        assertFalse(dadosColaborador.getCursoEmpregado().isEmpty());
        assertFalse(dadosColaborador.getSetorColaborador().isEmpty());
        assertFalse(dadosColaborador.getCargoColaborador().isEmpty());

        dadosColaborador.closeConnection();

    }

}