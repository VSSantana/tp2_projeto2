package entidades;

import dominios.Cod;

public class NivelFormacao {

    private Cod cod = new Cod();
    private String nivel;

    public NivelFormacao () { }

    public void setNivelFormacao (Integer cod,
                                  String nivel) {

        this.cod.setCod(cod);
        this.nivel = nivel.toUpperCase();

    }

    public Integer getCod () { return cod.getCod(); }

    public String getNivel () { return nivel; }

}
