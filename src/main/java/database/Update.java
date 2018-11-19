package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private Connection connection;

    public Update (Connection connection) {

        this.connection = connection;

    }

    public void closeConnection () {

        try {

            connection.close();

        } catch (Exception exception) {

            throw new NullPointerException("Não foi possível fechar a conexão com o banco de dados.");

        }

    }

    public int atualizarCurso (int pCodCurso,
                               String pNomeCurso) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_curso" +
                            " SET nome_curso = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pNomeCurso);
            preparedStatement.setInt(2, pCodCurso);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o curso. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarNivelFormacao (int pCodNivelFormacao,
                                       String pNivel) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_nivel_formacao" +
                            " SET nivel = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pNivel);
            preparedStatement.setInt(2, pCodNivelFormacao);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o nível de formação. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarCursoEmpregado (int pCodCursoEmpregado,
                                        int pCodCurso) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_curso_empregado" +
                            " SET cod_curso = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodCurso);
            preparedStatement.setInt(2, pCodCursoEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o curso do empregado. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarEmpregado (int pCodEmpregado,
                                   int pCodNivelFormacao,
                                   String pNome,
                                   int pIdade,
                                   String pCpf,
                                   Date pDataNascimento) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_empregado" +
                            " SET cod_nivel_formacao = ?," +
                                " nome = ?," +
                                " idade = ?," +
                                " cpf = ?," +
                                " data_nascimento = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodNivelFormacao);
            preparedStatement.setString(2, pNome);
            preparedStatement.setInt(3, pIdade);
            preparedStatement.setString(4, pCpf);
            preparedStatement.setDate(5, pDataNascimento);
            preparedStatement.setInt(6, pCodEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o empregado. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarIdentificadorEmpresa (int pCodEmpregado,
                                              String pIdentificadorEmpresa) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_empregado" +
                          " SET identificador_empresa = ?" +
                          " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o identificador da empresa do empregado. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarSetor (int pCodSetor,
                               int pCodDiretor,
                               String pNome) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_setor" +
                            " SET cod_diretor = ?," +
                                " nome = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodDiretor);
            preparedStatement.setString(2, pNome);
            preparedStatement.setInt(3, pCodSetor);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o setor. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarTipoEmpregado (int pCodTipoEmpregado,
                                       String pTipo,
                                       float pSalario,
                                       float pValeTransporte,
                                       int pPorcentagemBonus) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_tipo_empregado" +
                            " SET tipo = ?," +
                                " salario = ?," +
                                " vale_transporte = ?," +
                                " porcentagem_bonus = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pTipo);
            preparedStatement.setFloat(2, pSalario);
            preparedStatement.setFloat(3, pValeTransporte);
            preparedStatement.setInt(4, pPorcentagemBonus);
            preparedStatement.setInt(5, pCodTipoEmpregado);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o tipo de empregado. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

    public int atualizarVinculoEmpregaticio (int pCodVinculoEmpregaticio,
                                             int pCodTipoEmpregado,
                                             int pCodSetor,
                                             Date pDataInicio,
                                             Date pDataFim) {

        PreparedStatement preparedStatement;
        int vRetorno = -1;

        try {

            String sql = "UPDATE tb_vinculo_empregaticio" +
                            " SET cod_tipo_empregado = ?," +
                                " cod_setor = ?," +
                                " data_inicio = ?," +
                                " data_fim = ?" +
                            " WHERE COD = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodTipoEmpregado);
            preparedStatement.setInt(2, pCodSetor);
            preparedStatement.setString(3, String.valueOf(pDataInicio));
            preparedStatement.setString(4, String.valueOf(pDataFim));
            preparedStatement.setInt(5, pCodVinculoEmpregaticio);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível atualizar o vinculo empregatício. Retornou código: " + vRetorno);

        }

        vRetorno = 0;

        return vRetorno;

    }

}
