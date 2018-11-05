package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    private Connection connection;

    public Delete (Connection connection) {

        this.connection = connection;

    }

    public int apagarRegistro (int pCod, String pTabela) {

        PreparedStatement preparedStatement;
        int vRetorno = 1;

        String query = "DELETE FROM " + pTabela + " WHERE COD = ?";

        try {

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, pCod);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            throw new RuntimeException("Não foi possível deletar o registro da tabela " + pTabela + ".");

        }

        vRetorno = 0;

        return vRetorno;

    }

}
