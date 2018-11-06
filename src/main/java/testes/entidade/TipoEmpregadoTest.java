package testes.entidade;

import database.ConnectSQLiteDatabase;
import database.Delete;
import database.Insert;
import database.Query;
import entidades.TipoEmpregado;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class TipoEmpregadoTest {

    ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();

    Connection connection = connectSQLiteDatabase.dbConnect();

    @org.junit.jupiter.api.Test
    void setTipoEmpregadoValido () {

        Integer cod = 5;
        String tipo = "Consultor";
        float salario = 21000.00f;
        float valeTransporte = 0;
        Integer bonus = 0;
        TipoEmpregado tipoEmpregado = new TipoEmpregado();

        tipoEmpregado.setTipoEmpregado(cod, tipo, salario, valeTransporte, bonus);

        assertEquals(cod, tipoEmpregado.getCod());
        assertEquals(tipo.toUpperCase(), tipoEmpregado.getTipo());
        assertEquals(salario, tipoEmpregado.getSalario());
        assertEquals(valeTransporte, tipoEmpregado.getValeTransporte());
        assertEquals(bonus, tipoEmpregado.getPorcentagemBonus());

    }


}