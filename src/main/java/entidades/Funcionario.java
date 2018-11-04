package entidades;

import dominios.*;

import java.sql.Date;

public class Funcionario {

    private Nome nome = new Nome();
    private Idade idade = new Idade();
    private Data dataNascimento = new Data();
    private Cpf cpf = new Cpf();
    private String nivelFormacao;
    private String areaFormacao;
    private CodEmpresa codEmpresa = new CodEmpresa();
    private Data dataAdmissao = new Data();
    private Data dataDesligamento = new Data();
    private int codSetor;
    private Status status = new Status();

    public Funcionario () { }

    public void setFuncionario (String nome,
                                int idade,
                                Date dataNascimento,
                                String cpf,
                                String nivelFormacao,
                                String areaFormacao,
                                String codEmpresa,
                                Date dataAdmissao,
                                Date dataDesligamento,
                                int codSetor,
                                String status) {

        this.nome.setNome(nome);
        this.idade.setIdade(idade);
        this.dataNascimento.setData(dataNascimento);
        this.cpf.setCpf(cpf);
        this.nivelFormacao = nivelFormacao;
        this.areaFormacao = areaFormacao;
        this.codEmpresa.setCodEmpresa(codEmpresa);
        this.dataAdmissao.setData(dataAdmissao);
        this.dataDesligamento.setData(dataDesligamento);
        this.codSetor = codSetor;
        this.status.setStatus(status);

    }

    public String getNome () { return nome.getNome(); }

    public int getIdade () { return idade.getIdade(); }

    public Date getDataNascimento () { return dataNascimento.getDate(); }

    public String getCpf () { return cpf.getCpf(); }

    public String getNivelFormacao () { return nivelFormacao; }

    public String getAreaFormacao () { return areaFormacao; }

    public String getCodEmpresa () { return codEmpresa.getCodEmpresa(); }

    public Date getDataAdmissao () { return dataAdmissao.getDate(); }

    public Date getDataDesligamento () { return dataDesligamento.getDate(); }

    public int getCodSetor () { return codSetor; }

    public String getStatus () { return status.getStatus(); }

}
