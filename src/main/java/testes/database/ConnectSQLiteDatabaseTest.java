package testes.database;

import database.ConnectSQLiteDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ConnectSQLiteDatabaseTest {

    @org.junit.jupiter.api.Test
    void databaseConnection () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Connection connection = connectSQLiteDatabase.dbConnect();
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        String nome = null;

        try {

            String sql = "SELECT nome FROM tb_empregado WHERE cod = 1";

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                nome = resultSet.getString(1);

            }

        } catch (SQLException sqle) {

            sqle.printStackTrace();

        }

        assertNotEquals(nome, null);

    }

}