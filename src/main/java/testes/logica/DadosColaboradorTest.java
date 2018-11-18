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


    }

}