package entidades;

import dominios.Cod;

public class Setor {

    private Cod cod = new Cod();
    private String nome;

    public Setor () { }

    public void setSetor (Integer cod, String nome) {

        this.cod.setCod(cod);
        this.nome = nome.toUpperCase();

    }

    public Integer getCod () { return cod.getCod(); }

    public String getNome () { return nome; }

}
