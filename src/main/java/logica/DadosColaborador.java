package logica;

import database.Query;
import database.Update;
import entidades.Empregado;
import entidades.Setor;
import entidades.TipoEmpregado;
import entidades.VinculoEmpregaticio;

import java.sql.Connection;
import java.sql.Date;

public class DadosColaborador extends Empregado {

    // Não altera salário do colaborador. A estrutura do projeto considera o salário como parte integrante da função.

    private Connection connection;
    private VinculoEmpregaticio vinculo = new VinculoEmpregaticio();
    private VinculoEmpregaticio vinculoInicial = new VinculoEmpregaticio();
    private Empregado empregado = new Empregado();
    private float salario;
    private String cargo;
    private String setor;

    public DadosColaborador (Connection connection) {

        this.connection = connection;

    }

    public void recuperaDados (int pCodEmpregado) {

        Query consulta = new Query(connection);
        int codVinculo = consulta.retornaCodVinculoEmpregaticioPrimeiro(pCodEmpregado);
        int codVinculoInicial = consulta.retornaCodVinculoEmpregaticioPrimeiro(empregado.getCod());

        this.empregado = consulta.retornaRegistroEmpregado(pCodEmpregado);
        this.vinculo = consulta.retornaRegistroVinculoEmpregaticio(codVinculo);
        this.vinculoInicial = consulta.retornaRegistroVinculoEmpregaticio(codVinculoInicial);

        TipoEmpregado tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vinculo.getCodTipoEmpregado());
        Setor setorEmpregado = consulta.retornaRegistroSetor(vinculo.getCodSetor());

        this.setor = setorEmpregado.getNome();

        this.cargo = tipoEmpregado.getTipo();
        this.salario = tipoEmpregado.getSalario();

        setColaborador(empregado.getCod(),
                       empregado.getCodNivelFormacao(),
                       empregado.getIdentificadorEmpresa(),
                       empregado.getNomePessoa(),
                       empregado.getIdade(),
                       empregado.getCpf(),
                       empregado.getDataNascimento(),
                       cargo,
                       setor,
                       salario);

    }

    private void setColaborador (Integer cod,
                                Integer cod_nivel_formacao,
                                String identificadorEmpresa,
                                String nome,
                                int idade,
                                String cpf,
                                Date dataNascimento,
                                String cargo,
                                String setor,
                                float salario) {

        super.setEmpregado (cod, cod_nivel_formacao, identificadorEmpresa, nome, idade, cpf, dataNascimento);


    }

    public void alterarNome (int pCodEmpregado, String pNome) {

        Update update = new Update(connection);

        super.setEmpregado (super.getCod(),
                            super.getCodNivelFormacao(),
                            super.getIdentificadorEmpresa(),
                            pNome,
                            super.getIdade(),
                            super.getCpf(),
                            super.getDataNascimento());

        update.atualizarEmpregado(super.getCod(),
                                  super.getCodNivelFormacao(),
                                  super.getNomePessoa(),
                                  super.getIdade(),
                                  super.getCpf(),
                                  super.getDataNascimento());

    }

    public void alterarIdade (int pCodEmpregado, int pIdade) {

        Update update = new Update(connection);

        super.setEmpregado (super.getCod(),
                super.getCodNivelFormacao(),
                super.getIdentificadorEmpresa(),
                super.getNomePessoa(),
                pIdade,
                super.getCpf(),
                super.getDataNascimento());

        update.atualizarEmpregado(super.getCod(),
                                  super.getCodNivelFormacao(),
                                  super.getNomePessoa(),
                                  super.getIdade(),
                                  super.getCpf(),
                                  super.getDataNascimento());

    }

    public void alterarDataNascimento (int pCodEmpregado, Date pDataNascimento) {

        Update update = new Update(connection);

        super.setEmpregado (super.getCod(),
                super.getCodNivelFormacao(),
                super.getIdentificadorEmpresa(),
                super.getNomePessoa(),
                super.getIdade(),
                super.getCpf(),
                pDataNascimento);

        update.atualizarEmpregado(super.getCod(),
                                  super.getCodNivelFormacao(),
                                  super.getNomePessoa(),
                                  super.getIdade(),
                                  super.getCpf(),
                                  super.getDataNascimento());

    }

    public void alterarCpf (int pCodEmpregado, String pCpf) {

        Update update = new Update(connection);

        super.setEmpregado (super.getCod(),
                super.getCodNivelFormacao(),
                super.getIdentificadorEmpresa(),
                super.getNomePessoa(),
                super.getIdade(),
                pCpf,
                super.getDataNascimento());

        update.atualizarEmpregado(super.getCod(),
                super.getCodNivelFormacao(),
                super.getNomePessoa(),
                super.getIdade(),
                super.getCpf(),
                super.getDataNascimento());

    }

    public void alterarIdentificadoEmpresa (int pCodEmpregado, String pIdentificadorEmpresa) {

        Update update = new Update(connection);

        super.setEmpregado (super.getCod(),
                            super.getCodNivelFormacao(),
                            pIdentificadorEmpresa,
                            super.getNomePessoa(),
                            super.getIdade(),
                            super.getCpf(),
                            super.getDataNascimento());

        update.atualizarIdentificadorEmpresa(super.getCod(),
                                             super.getIdentificadorEmpresa());

    }

    public void alterarDataAdmissao (int pCodEmpregado, Date pDataInicio) {

        Update update = new Update(connection);

        vinculoInicial.setVinculoEmpregaticio(vinculoInicial.getCod(),
                                              vinculoInicial.getCodEmpregado(),
                                              vinculoInicial.getCodTipoEmpregado(),
                                              vinculoInicial.getCodSetor(),
                                              pDataInicio,
                                              vinculoInicial.getDataFim());

        update.atualizarVinculoEmpregaticio(vinculoInicial.getCod(),
                                            vinculoInicial.getCodTipoEmpregado(),
                                            vinculoInicial.getCodSetor(),
                                            vinculoInicial.getDataInicio(),
                                            vinculoInicial.getDataFim());

    }

    public void alterarSetor (int pCodEmpregado, String pSetor) {

        Update update = new Update(connection);
        Query consulta = new Query(connection);
        int vCodSetor = consulta.retornaCodSetor(pSetor);
        TipoEmpregado tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vinculo.getCodTipoEmpregado());

        vinculo.setVinculoEmpregaticio(vinculo.getCod(),
                                       vinculo.getCodEmpregado(),
                                       vinculo.getCodTipoEmpregado(),
                                       vCodSetor,
                                       vinculo.getDataInicio(),
                                       vinculo.getDataFim());

        if (!tipoEmpregado.getTipo().equals("AUXILIAR")) {

            if (tipoEmpregado.getTipo().equals("TÉCNICO")) {

                int vCodNivelFormacaoMedio = consulta.retornaCodNivelFormacao("2º GRAU (ENSINO MÉDIO)");

                if (empregado.getCodNivelFormacao() == vCodNivelFormacaoMedio) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

            }

            else {

                int vCodNivelFormacaoSuperior = consulta.retornaCodNivelFormacao("3º GRAU (ENSINO SUPERIOR)");

                if (empregado.getCodNivelFormacao() != vCodNivelFormacaoSuperior) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

                else {

                    ValidarQualificao validarQualificao = new ValidarQualificao(connection);

                    if (!validarQualificao.validarFormacaoSetor(pSetor, pCodEmpregado)) {

                        throw new IllegalArgumentException("Curso incompatível com o setor designado.");

                    }

                }

            }

        }

        update.atualizarVinculoEmpregaticio(vinculo.getCod(),
                                            vinculo.getCodTipoEmpregado(),
                                            vinculo.getCodSetor(),
                                            vinculo.getDataInicio(),
                                            vinculo.getDataFim());

    }

    // Aqui o objetivo é alterar um registro por ocasião de erro e não de promoção.

    public void alterarCargo (int pCodEmpregado, String pCargo) {

        Update update = new Update(connection);
        Query consulta = new Query(connection);
        int vCodCargo = consulta.retornaCodTipoEmpregado(pCargo);
        TipoEmpregado tipoEmpregado = consulta.retornaRegistroTipoEmpregado(vinculo.getCodTipoEmpregado());

        vinculo.setVinculoEmpregaticio(vinculo.getCod(),
                vinculo.getCodEmpregado(),
                vCodCargo,
                vinculo.getCodSetor(),
                vinculo.getDataInicio(),
                vinculo.getDataFim());

        if (!tipoEmpregado.getTipo().equals("AUXILIAR")) {

            if (tipoEmpregado.getTipo().equals("TÉCNICO")) {

                int vCodNivelFormacaoMedio = consulta.retornaCodNivelFormacao("2º GRAU (ENSINO MÉDIO)");

                if (empregado.getCodNivelFormacao() == vCodNivelFormacaoMedio) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

            }

            else {

                int vCodNivelFormacaoSuperior = consulta.retornaCodNivelFormacao("3º GRAU (ENSINO SUPERIOR)");

                if (empregado.getCodNivelFormacao() != vCodNivelFormacaoSuperior) {

                    throw new IllegalArgumentException("Formação imcompatível com a função.");

                }

                else {

                    ValidarQualificao validarQualificao = new ValidarQualificao(connection);

                    if (!validarQualificao.validarFormacaoSetor(setor, pCodEmpregado)) {

                        throw new IllegalArgumentException("O colaborador não possui formação compatível com o setor.");

                    }

                }

            }

        }

        update.atualizarVinculoEmpregaticio(vinculo.getCod(),
                                            vinculo.getCodTipoEmpregado(),
                                            vinculo.getCodSetor(),
                                            vinculo.getDataInicio(),
                                            vinculo.getDataFim());

    }

    public String getNomeColaborador () { return super.getNomePessoa(); }

    public int getIdadeColaborador () { return super.getIdade(); }

    public Date getDataNascimentoColaborador () { return super.getDataNascimento(); }

    public String getCpfColaborador () { return super.getCpf(); }

    public String getIdentificadorColaboradorEmpresa () {return super.getIdentificadorEmpresa(); }

    public String getSetorColaborador () { return setor; }

    public String getCargoColaborador () { return cargo; }

    public float getSalario () { return salario; }

    public Date getDataAdmissao () { return vinculoInicial.getDataInicio(); }

}
