package testes.logica;

import database.ConnectSQLiteDatabase;
import logica.Projeto4;

import static org.junit.jupiter.api.Assertions.*;

class Projeto4Test {

    @org.junit.jupiter.api.Test
    void projeto4 () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Projeto4 porcentagem = new Projeto4(connectSQLiteDatabase.dbConnect());
        float percentagem = porcentagem.calcularPorcentagem(6000.00f);
        System.out.println(percentagem);
        assertTrue(percentagem > 0);

    }

}