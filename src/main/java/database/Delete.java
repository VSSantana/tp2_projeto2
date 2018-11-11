package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    private Connection connection;

    public Delete (Connection connection) {

        this.connection = connection;

    }

    public void closeConnection () {

        try {

            connection.close();

        } catch (Exception exception) {

            throw new NullPointerException("Não foi possível fechar a conexão com o banco de dados.");

        }

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

    public int apagarEmpregado (int pCodEmpregado) {

        PreparedStatement preparedStatement;
        int vRetorno = 1;

        String query = "DELETE FROM tb_vinculo_empregaticio WHERE cod_empregado = ?";

        try {

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, pCodEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new RuntimeException("Não foi possível deletar o registro da tabela tb_vinculo_empregaticio.");

        }

        query = "DELETE FROM tb_curso_empregado WHERE cod_empregado = ?";

        try {

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, pCodEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            throw new RuntimeException("Não foi possível deletar o registro da tabela tb_curso_empregado.");

        }

        query = "DELETE FROM tb_empregado WHERE cod = ?";

        try {

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, pCodEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            throw new RuntimeException("Não foi possível deletar o registro da tabela tb_empregado.");

        }

        vRetorno = 0;

        return vRetorno;

    }

}
