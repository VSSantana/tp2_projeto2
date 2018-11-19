package logica;

import database.Insert;
import database.Query;
import database.Update;
import entidades.*;

import java.sql.Connection;
import java.sql.Date;

public class AlterarFuncao {

    private Connection connection;

    public AlterarFuncao (Connection connection) {

        this.connection = connection;

    }

    public void alterarFuncao (String funcao, Integer codEmpregado, Date dataInicioNovaFuncao) {

        Integer codTipoEmpregado;
        Integer codVinculoEmpregaticioAtivo;
        VinculoEmpregaticio vinculo;
        Empregado empregado;
        Query query = new Query(connection);
        Update update = new Update(connection);
        Insert insert = new Insert(connection);
        Date dataFimFuncaoAtual = Date.valueOf(dataInicioNovaFuncao.toLocalDate().minusDays(1));

        codTipoEmpregado = query.retornaCodTipoEmpregado(funcao);
        empregado = query.retornaRegistroEmpregado(codEmpregado);

        if (!funcao.equals("AUXILIAR")) {

            if (funcao.equals("TÉCNICO")) {

                int vCodNivelFormacaoMedio = query.retornaCodNivelFormacao("2º GRAU (ENSINO MÉDIO)");

                if (empregado.getCodNivelFormacao() == vCodNivelFormacaoMedio) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

            }

            else {

                int vCodNivelFormacaoSuperior = query.retornaCodNivelFormacao("3º GRAU (ENSINO SUPERIOR)");

                if (empregado.getCodNivelFormacao() != vCodNivelFormacaoSuperior) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

                else {

                    ValidarQualificao validarQualificao = new ValidarQualificao();

                    vinculo = query.retornaRegistroVinculoEmpregaticio(empregado.getCod());
                    Setor vSetor = query.retornaRegistroSetor(vinculo.getCodSetor());
                    CursoEmpregado cursoEmpregado = query.retornaRegistroCursoEmpregado(query.retornaCodCursoEmpregado(empregado.getCod()));
                    Curso cursoAcademico = query.retornaRegistroCurso(cursoEmpregado.getCodCurso());

                    if (!validarQualificao.validarFormacaoSetor(vSetor.getNome(), cursoAcademico.getNomeCurso())) {

                        throw new IllegalArgumentException("Curso incompatível com o setor designado.");

                    }

                }

            }

        }

        codVinculoEmpregaticioAtivo = query.retornaCodVinculoEmpregaticioAtivo(codEmpregado);
        vinculo = query.retornaRegistroVinculoEmpregaticio(codVinculoEmpregaticioAtivo);

        update.atualizarVinculoEmpregaticio(codVinculoEmpregaticioAtivo,
                                            vinculo.getCodTipoEmpregado(),
                                            vinculo.getCodSetor(),
                                            vinculo.getDataInicio(),
                                            dataFimFuncaoAtual);

        insert.insereVinculoEmpregaticio(codEmpregado,
                                         codTipoEmpregado,
                                         vinculo.getCodSetor(),
                                         dataInicioNovaFuncao,
                                         null);

    }

}
