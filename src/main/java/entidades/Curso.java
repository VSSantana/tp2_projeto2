package entidades;

import dominios.Cod;

public class Curso {

    private Cod cod = new Cod();
    private String nomeCurso;

    public Curso () { }

    public void setCurso (Integer cod,
                          String nomeCurso) {

        this.cod.setCod(cod);
        this.nomeCurso = nomeCurso.toUpperCase();

    }

    public Integer getCod () { return cod.getCod(); }

    public String getNomeCurso () { return nomeCurso; }

}
