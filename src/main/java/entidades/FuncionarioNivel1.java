package entidades;

import java.sql.Date;

public class FuncionarioNivel1 extends Funcionario {

    private int codFuncao;

    public FuncionarioNivel1 () { }

    public void setFuncionarioNivel1 (String nome,
                                      int idade,
                                      Date dataNascimento,
                                      String cpf,
                                      String nivelFormacao,
                                      String areaFormacao,
                                      String codEmpresa,
                                      Date dataAdmissao,
                                      Date dataDesligamento,
                                      int codSetor,
                                      String status,
                                      int codFuncao) {

        super.setFuncionario(nome,
                             idade,
                             dataNascimento,
                             cpf,
                             nivelFormacao,
                             areaFormacao,
                             codEmpresa,
                             dataAdmissao,
                             dataDesligamento,
                             codSetor,
                             status);

        this.codFuncao = codFuncao;

    }

}
