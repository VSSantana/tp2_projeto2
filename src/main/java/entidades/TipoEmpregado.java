package entidades;

import dominios.Cod;
import dominios.ValorMonetario;

public class TipoEmpregado {

    private Cod cod = new Cod();
    private String tipo;
    private ValorMonetario salario = new ValorMonetario();
    private ValorMonetario valeTransporte = new ValorMonetario();
    private Integer porcentagemBonus;

    public TipoEmpregado () { }

    public void setTipoEmpregado (Integer cod,
                                  String tipo,
                                  float salario,
                                  float valeTransporte,
                                  Integer porcentagemBonus) {

        this.cod.setCod(cod);
        this.tipo = tipo.toUpperCase();
        this.salario.setValor(salario);
        this.valeTransporte.setValor(valeTransporte);
        this.porcentagemBonus = porcentagemBonus;

    }

    public Integer getCod () { return cod.getCod(); }

    public String getTipo () { return tipo; }

    public float getSalario () { return salario.getValor(); }

    public float getValeTransporte() { return valeTransporte.getValor(); }

    public Integer getPorcentagemBonus () { return porcentagemBonus; }

}
