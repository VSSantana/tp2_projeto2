package entidades;

import dominios.Cod;

public class Setor {

    private Cod cod = new Cod();
    private Cod codDiretor = new Cod();
    private String nome;

    public Setor () { }

    public void setSetor (Integer cod, Integer codDiretor, String nome) {

        this.cod.setCod(cod);
        this.codDiretor.setCod(codDiretor);
        this.nome = nome.toUpperCase();

    }

    public Integer getCod () { return cod.getCod(); }

    public Integer getCodDiretor () { return codDiretor.getCod(); }

    public String getNome () { return nome; }

}
