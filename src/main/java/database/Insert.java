package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    private Connection connection;

    public Insert (Connection connection) {

        this.connection = connection;

    }

    public int insereCurso (String pNomeCurso) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_curso");

        try {

            String sql = "INSERT INTO tb_curso(cod," +
                                             " nome_curso)" +
                            " VALUES (?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setString(2, pNomeCurso);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo curso.");

        }

        return vCod;

    }

    public int insereCursoEmpregado (Integer pCodEmpregado,
                                     Integer pCodCurso) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_curso_empregado");

        try {

            String sql = "INSERT INTO tb_curso_empregado (cod," +
                                                        " cod_empregado," +
                                                        " cod_curso)" +
                             " VALUES (?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setInt(2, pCodEmpregado);
            preparedStatement.setInt(3, pCodCurso);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo curso do empregado.");

        }

        return vCod;

    }

    public int insereNivelFormacao (String pNivel) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_nivel_formacao");

        try {

            String sql = "INSERT INTO tb_nivel_formacao(cod," +
                                                      " nivel)" +
                            " VALUES (?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setString(2, pNivel);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o nível de formação.");

        }

        return vCod;

    }

    public int insereSetor (Integer pCodDiretor,
                            String pNome) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_setor");

        try {

            String sql = "INSERT INTO tb_setor (cod," +
                                              " cod_diretor," +
                                              " nome)" +
                            " VALUES (?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setInt(2, pCodDiretor);
            preparedStatement.setString(3, pNome);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo setor.");

        }

        return vCod;

    }

    public int insereEmpregado (Integer pCodNivelFormacao,
                                String pIdentificadorEmpresa,
                                String pNome,
                                int pIdade,
                                String pCpf,
                                Date pDataNascimento) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_empregado");

        try {

            String sql = "INSERT INTO tb_empregado (cod," +
                                                  " cod_nivel_formacao," +
                                                  " identificador_empresa," +
                                                  " nome," +
                                                  " idade," +
                                                  " cpf," +
                                                  " data_nascimento)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setInt(2, pCodNivelFormacao);
            preparedStatement.setString(3, pIdentificadorEmpresa);
            preparedStatement.setString(4, pNome);
            preparedStatement.setInt(5, pIdade);
            preparedStatement.setString(6, pCpf);
            preparedStatement.setDate(7, pDataNascimento);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo empregado.");

        }

        return vCod;

    }

    public int insereVinculoEmpregaticio (Integer pCodEmpregado,
                                          Integer pCodTipoEmpregado,
                                          Integer pCodSetor,
                                          Date pDataInicio,
                                          Date pDataFim) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_vinculo_empregaticio");

        try {

            String sql = "INSERT INTO tb_vinculo_empregaticio (cod," +
                                                             " cod_empregado," +
                                                             " cod_tipo_empregado," +
                                                             " cod_setor," +
                                                             " data_inicio," +
                                                             " data_fim)" +
                            " VALUES (?, ?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setInt(2, pCodEmpregado);
            preparedStatement.setInt(3, pCodTipoEmpregado);
            preparedStatement.setInt(4, pCodSetor);
            preparedStatement.setDate(5, pDataInicio);
            preparedStatement.setDate(6, pDataFim);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo vínculo empregatício.");

        }

        return vCod;

    }

    public int insereTipoEmpregado (String pTipo,
                                    float pSalario,
                                    float pValeTransporte,
                                    int pPorcentagemBonus) {

        PreparedStatement preparedStatement;
        Query consulta = new Query(connection);

        int vCod = consulta.retornaCodSequenceTable("tb_tipo_empregado");

        try {

            String sql = "INSERT INTO tb_tipo_empregado (cod," +
                                                       " tipo," +
                                                       " salario," +
                                                       " vale_transporte," +
                                                       " porcentagem_bonus)" +
                            " VALUES (?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, vCod);
            preparedStatement.setString(2, pTipo);
            preparedStatement.setFloat(3, pSalario);
            preparedStatement.setFloat(4, pValeTransporte);
            preparedStatement.setInt(5, pPorcentagemBonus);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {

            sqle.printStackTrace();

            throw new NullPointerException("Não foi possível inserir o novo tipo de empregado.");

        }

        return vCod;

    }




}
