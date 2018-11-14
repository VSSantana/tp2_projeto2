package logica;

import database.Insert;
import database.Query;
import dominios.IdentificadorEmpresa;
import entidades.CursoEmpregado;
import entidades.Empregado;
import entidades.VinculoEmpregaticio;

import java.sql.Connection;
import java.sql.Date;

public class CadastrarEmpregado {

    private Connection connection;

    public CadastrarEmpregado (Connection connection) {

        this.connection = connection;

    }

    // Níveis de formação:

    // "1º GRAU (ENSINO FUNDAMENTAL)"
    // "2º GRAU (ENSINO MÉDIO)"
    // "3º GRAU (ENSINO SUPERIOR)"
    // "2º GRAU (CURSO TÉCNICO)"

    // Cursos:

    // "ADMINISTRAÇÃO"
    // "CIÊNCIAS CONTÁBEIS"
    // "COMUNICAÇÃO SOCIAL"
    // "ECONOMIA"
    // "MARKETING"
    // "ENGENHARIA DA COMPUTAÇÃO"
    // "ENGENHARIA DE SISTEMAS"
    // "ENGENHARIA DA INFORMAÇÃO"
    // "DIREITO"
    // "DESIGN GRÁFICO"
    // "DESIGN DE MULTIMIDIA"
    // "ENGENHARIA SOCIAL"

    // TIpo empregado:

    // "AUXILIAR"
    // "TÉCNICO"
    // "PROFISSIONAL"
    // "DIRETOR DE SETOR"
    // "DIRETOR DE OPERAÇÕES"
    // "DIRETOR EXECUTIVO"

    // Setores:

    // "FINANÇAS"
    // "MARKETING"
    // "TECNOLOGIA"
    // "NORMATIVIDADE"
    // "DESIGN"

    public int cadastrarNovoEmpregado (String pNome,
                                       int pIdade,
                                       String pCpf,
                                       Date pDataNascimento,
                                       String pNivelFormacao,
                                       String pCurso,
                                       String pTipoEmpregado,
                                       String pSetor,
                                       Date pDataAdmissao){

        int vRetorno = -1;
        Query consulta = new Query(connection);
        Insert insert = new Insert(connection);
        Empregado empregado = new Empregado();
        CursoEmpregado cursoEmpregado = new CursoEmpregado();
        VinculoEmpregaticio vinculoEmpregaticio = new VinculoEmpregaticio();

        if (pDataAdmissao == null) {

            throw new IllegalArgumentException("Data de admissão não foi inserida.");

        }

        try {

            int vCodNivelFormacao = consulta.retornaCodNivelFormacao(pNivelFormacao);
            String vIdentificadorEmpresa = new IdentificadorEmpresa().gerarIdentificador(connection);
            empregado.setEmpregado(null,
                                   vCodNivelFormacao,
                                   vIdentificadorEmpresa,
                                   pNome,
                                   pIdade,
                                   pCpf,
                                   pDataNascimento);

        } catch (Exception exception) {

            exception.printStackTrace();

            throw new IllegalArgumentException("Erro nos parâmetros passados.");

        }

        try {

            int vCodSetor = consulta.retornaCodSetor(pSetor);
            int vCodTipoEmpregado = consulta.retornaCodTipoEmpregado(pTipoEmpregado);
            int vCodCurso = 0;

            if (pCurso != null && !pCurso.isEmpty()) {

                vCodCurso = consulta.retornaCodCurso(pCurso);

            }

            if (vCodCurso != 0) {

                if (pNivelFormacao.equals("3º GRAU (ENSINO SUPERIOR)")) {

                    ValidarQualificao validarQualificao = new ValidarQualificao(connection);

                    if (!validarQualificao.validarFormacaoSetor(pSetor, empregado.getCod())) {

                        throw new IllegalArgumentException("Curso incompatível com o setor designado.");

                    }

                }

            }

            int vCodEmpregado = insert.insereEmpregado(empregado.getCodNivelFormacao(),
                                                       empregado.getIdentificadorEmpresa(),
                                                       empregado.getNomePessoa(),
                                                       empregado.getIdade(),
                                                       empregado.getCpf(),
                                                       empregado.getDataNascimento());

            if (pCurso != null && !pCurso.isEmpty()) {

                insert.insereCursoEmpregado(vCodEmpregado, vCodCurso);

            }

            insert.insereVinculoEmpregaticio(vCodEmpregado,
                                             vCodTipoEmpregado,
                                             vCodSetor,
                                             pDataAdmissao,
                                            null);

            vRetorno = vCodEmpregado;

            connection.close();

        } catch (Exception exception) {

            exception.printStackTrace();

            throw new IllegalArgumentException("Os parâmetros passados não correspondem às regras de negócio.");

        }

        return vRetorno;

    }

}
