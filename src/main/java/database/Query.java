package database;

import entidades.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query {

    private Connection connection;

    public Query (Connection connection) {

        this.connection = connection;

    }

    public int retornaCodSequenceTable(String pNomeTabela) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCodSequence = 0;

        try {

            preparedStatement = connection.prepareStatement("SELECT MAX(cod) FROM " + pNomeTabela);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCodSequence = resultSet.getInt(1);
                vCodSequence = vCodSequence + 1;

            }

        } catch (SQLException sqle) {

            throw new NullPointerException("Não foi possível recuperar o número de sequência da chave primária da tabela " + pNomeTabela +".");

        }

        if (vCodSequence == 0) {

            throw new NullPointerException("Não foi possível recuperar o número de sequência da chave primária da tabela " + pNomeTabela +".");

        }

        return vCodSequence;

    }

    public int retornaCodTipoEmpregado (String pTipo) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_tipo_empregado " +
                            "WHERE UPPER(tipo) = UPPER(?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pTipo);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do tipo de empregado especificado.");

        }

        return vCod;

    }

    public Curso retornaRegistroCurso (int pCodCurso) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        Curso registro = new Curso();

        try {

            String sql =  "SELECT nome_curso " +
                            "FROM tb_curso " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodCurso);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setCurso(pCodCurso, resultSet.getString(1));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro do curso especificado.");

        }

        return registro;

    }

    public CursoEmpregado retornaRegistroCursoEmpregado (int pCodCursoEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        CursoEmpregado registro = new CursoEmpregado();

        try {

            String sql =  "SELECT cod_empregado, " +
                                 "cod_curso " +
                            "FROM tb_curso_empregado " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodCursoEmpregado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setCursoEmpregado(pCodCursoEmpregado, resultSet.getInt(1), resultSet.getInt(2));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro de curso do empregado especificado.");

        }

        return registro;

    }

    public Empregado retornaRegistroEmpregado (int pCodEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        Empregado registro = new Empregado();

        try {

            String sql =  "SELECT cod_nivel_formacao, " +
                                 "identificador_empresa, " +
                                 "nome, " +
                                 "idade, " +
                                 "cpf, " +
                                 "data_nascimento " +
                           "FROM tb_empregado " +
                           "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodEmpregado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setEmpregado(pCodEmpregado,
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getString(5),
                        resultSet.getDate(6));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro do empregado especificado.");

        }

        return registro;

    }

    public NivelFormacao retornaRegistroNivelFormacao (int pCodNivelFormacao) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        NivelFormacao registro = new NivelFormacao();

        try {

            String sql =  "SELECT nivel " +
                            "FROM tb_nivel_formacao " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodNivelFormacao);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setNivelFormacao(pCodNivelFormacao, resultSet.getString(1));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro de nível de formação especificado.");

        }

        return registro;

    }

    public Setor retornaRegistroSetor (int pCodSetor) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        Setor registro = new Setor();

        try {

            String sql =  "SELECT cod_diretor, " +
                                 "nome " +
                            "FROM tb_setor " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodSetor);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setSetor(pCodSetor, resultSet.getInt(1), resultSet.getString(2));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro de setor especificado.");

        }

        return registro;

    }

    public TipoEmpregado retornaRegistroTipoEmpregado (int pCodTipoEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        TipoEmpregado registro = new TipoEmpregado(connection);

        try {

            String sql =  "SELECT tipo, " +
                                 "salario, " +
                                 "vale_transporte, " +
                                 "porcentagem_bonus " +
                            "FROM tb_tipo_empregado " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodTipoEmpregado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setTipoEmpregado(pCodTipoEmpregado,
                                          resultSet.getString(1),
                                          resultSet.getFloat(2),
                                          resultSet.getFloat(3),
                                          resultSet.getInt(4));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro do tipo de empregado especificado.");

        }

        return registro;

    }

    public VinculoEmpregaticio retornaRegistroVinculoEmpregaticio (int pCodVinculoEmpregaticio) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        VinculoEmpregaticio registro = new VinculoEmpregaticio();

        try {

            String sql =  "SELECT cod_empregado, " +
                                 "cod_tipo_empregado, " +
                                 "cod_setor, " +
                                 "data_inicio, " +
                                 "data_fim " +
                            "FROM tb_vinculo_empregaticio " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodVinculoEmpregaticio);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                registro.setVinculoEmpregaticio(pCodVinculoEmpregaticio,
                                                resultSet.getInt(1),
                                                resultSet.getInt(2),
                                                resultSet.getInt(3),
                                                resultSet.getDate(4),
                                                resultSet.getDate(5));

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro de vinculo empregatício especificado.");

        }

        return registro;

    }

}
