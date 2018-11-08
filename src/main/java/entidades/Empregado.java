package entidades;

import dominios.*;

import java.sql.Date;

public class Empregado {

    private Cod cod = new Cod();
    private Cod cod_nivel_formacao = new Cod();
    private IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();
    private NomePessoa nomePessoa = new NomePessoa();
    private Idade idade = new Idade();
    private Cpf cpf = new Cpf();
    private Data dataNascimento = new Data();

    public Empregado() { }

    public void setEmpregado (Integer cod,
                              Integer cod_nivel_formacao,
                              String identificadorEmpresa,
                              String nome,
                              int idade,
                              String cpf,
                              Date dataNascimento) {

        this.cod.setCod(cod);
        this.cod_nivel_formacao.setCod(cod_nivel_formacao);
        this.identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresa);
        this.nomePessoa.setNome(nome);
        this.idade.setIdade(idade);
        this.cpf.setCpf(cpf);
        this.dataNascimento.setData(dataNascimento);

    }

    public Integer getCod () { return cod.getCod(); }

    public Integer getCodNivelFormacao () { return cod_nivel_formacao.getCod(); }

    public String getIdentificadorEmpresa() { return identificadorEmpresa.getIdentificadorEmpresaEmpresa(); }

    public String getNomePessoa() { return nomePessoa.getNome(); }

    public int getIdade () { return idade.getIdade(); }

    public String getCpf () { return cpf.getCpf(); }

    public Date getDataNascimento () { return dataNascimento.getDate(); }

}
