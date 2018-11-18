package database;

import entidades.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class Query {

    private Connection connection;

    public Query (Connection connection) {

        this.connection = connection;

    }

    public void closeConnection () {

        try {

            connection.close();

        } catch (Exception exception) {

            throw new NullPointerException("Não foi possível fechar a conexão com o banco de dados.");

        }

    }

    public ArrayList<String> retornaCursosEmpregado (int pCodEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        ArrayList<String> cursos = new ArrayList<>();

        try {

            String sql = "SELECT nome_curso" +
                          " FROM tb_curso c" +
                            " JOIN tb_curso_empregado ce ON ce.cod_curso = c.cod" +
                          " WHERE ce.cod_empregado = ?";

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                cursos.add(resultSet.getString(1));

            }

        } catch (SQLException e) {

            throw new NullPointerException("Erro ao recuperar os cursos do empregado.");

        }

        return cursos;

    }

    public int retornaNumeroEmpregadosAtivos() {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vNummeroEmpregadosAtivos = 0;

        try {

            String sql =  "SELECT COUNT(cod) " +
                            "FROM tb_vinculo_empregaticio " +
                            "WHERE data_fim IS NULL";

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vNummeroEmpregadosAtivos = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o número de empregados ativos.");

        }

        return vNummeroEmpregadosAtivos;

    }

    public int retornaNumeroEmpregadosFuncao(int pCodFuncao) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vNumeroEmpregadosFuncao = 0;

        try {

            String sql =  "SELECT COUNT(cod) " +
                            "FROM tb_vinculo_empregaticio " +
                            "WHERE data_fim IS NULL AND cod_tipo_empregado = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodFuncao);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vNumeroEmpregadosFuncao = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o número de empregados ativos na função.");

        }

        return vNumeroEmpregadosFuncao;

    }

    public ArrayList<Integer> retornaFuncoesSalarioMenor(float pSalario) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        ArrayList<Integer> funcoes = new ArrayList<>();

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_tipo_empregado " +
                            "WHERE salario < ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1, pSalario);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                funcoes.add(resultSet.getInt(1));

                while (resultSet.next()) {

                    funcoes.add(resultSet.getInt(1));

                }

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar as funções abaixo relacionadas a este valor.");

        }

        return funcoes;

    }

    public float retornaFuncoesSalario (int pCodFuncao) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        float salario = 0;

        try {

            String sql =  "SELECT salario " +
                            "FROM tb_tipo_empregado " +
                            "WHERE cod = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodFuncao);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                salario = resultSet.getFloat(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar a remuneração da função.");

        }

        return salario;

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

    public int retornaCodNivelFormacao (String pNivel) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_nivel_formacao " +
                            "WHERE UPPER(nivel) = UPPER(?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pNivel);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do nível de formação especificado.");

        }

        return vCod;

    }

    public int retornaCodCurso (String pCurso) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_curso " +
                            "WHERE UPPER(nome_curso) = UPPER(?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pCurso);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do curso especificado.");

        }

        return vCod;

    }

    public int retornaCodSetor (String pSetor) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_setor " +
                            "WHERE UPPER(nome) = UPPER(?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pSetor);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do setor especificado.");

        }

        return vCod;

    }

    public int retornaExiteIndentificadorEmpresa (String pIndetificadorEmpresa) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vRetorno = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_empregado " +
                            "WHERE UPPER(identificador_empresa) = UPPER(?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pIndetificadorEmpresa);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vRetorno = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod de identificação da empresa do empregado.");

        }

        return vRetorno;

    }

    public int retornaCodVinculoEmpregaticioAtivo (int pCodEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                    "FROM tb_vinculo_empregaticio " +
                    "WHERE cod_empregado = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodEmpregado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do vínculo empregatício ativo.");

        }

        return vCod;

    }

    public int retornaCodVinculoEmpregaticioPrimeiro (int pCodEmpregado) {

        PreparedStatement preparedStatement;
        ResultSet resultSet;

        int vCod = 0;

        try {

            String sql =  "SELECT cod " +
                            "FROM tb_vinculo_empregaticio " +
                            "WHERE cod_empregado = ? " +
                              "AND data_inicio = (SELECT MIN(data_inicio) " +
                                                   "FROM tb_vinculo_empregaticio " +
                                                   "WHERE cod_empregado = ?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pCodEmpregado);
            preparedStatement.setInt(2, pCodEmpregado);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                vCod = resultSet.getInt(1);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o cod do vínculo empregatício ativo.");

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
                                      Date.valueOf(resultSet.getString(6)));

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

        TipoEmpregado registro = new TipoEmpregado();

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

                Date dataFim;

                if (resultSet.getString(5) == null || resultSet.getString(5).isEmpty()) {

                    dataFim = null;

                }

                else {

                    dataFim = Date.valueOf(resultSet.getString(5));

                }

                registro.setVinculoEmpregaticio(pCodVinculoEmpregaticio,
                                                resultSet.getInt(1),
                                                resultSet.getInt(2),
                                                resultSet.getInt(3),
                                                Date.valueOf(resultSet.getString(4)),
                                                dataFim);

            }

        } catch (SQLException exception) {

            exception.printStackTrace();

            throw new NullPointerException("Não foi possível recuperar o registro de vinculo empregatício especificado.");

        }

        return registro;

    }

}
