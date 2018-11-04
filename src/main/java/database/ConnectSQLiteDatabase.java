package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQLiteDatabase {

    public Connection dbConnect() {

        Connection conn = null;

        try {

            // Database parameters.

            String url = "jdbc:sqlite:./database/companydb.db";

            // Create a connection to the database.

            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {

            e.printStackTrace();

            throw new NullPointerException("Erro ao se conectar com banco de dados SQLite, na base companydb.");

        }

        return conn;

    }

}
