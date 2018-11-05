package entidades;

import database.ConnectSQLiteDatabase;
import database.Update;
import dominios.Cod;
import dominios.ValorMonetario;

import java.sql.Connection;

public class TipoEmpregado {

    private Connection connection;
    private Cod cod = new Cod();
    private String tipo;
    private ValorMonetario salario = new ValorMonetario();
    private ValorMonetario valeTransporte = new ValorMonetario();
    private Integer porcentagemBonus;

    public TipoEmpregado (Connection connection) {

        this.connection = connection;

    }

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

    public void aumentarSalario (float novoSalario) {

        this.salario.setValor(novoSalario);
        Update update = new Update(connection);
        update.atualizarTipoEmpregado(cod.getCod(),
                                      tipo,
                                      salario.getValor(),
                                      valeTransporte.getValor(),
                                      porcentagemBonus);

    }

    public Integer getCod () { return cod.getCod(); }

    public String getTipo () { return tipo; }

    public float getSalario () { return salario.getValor(); }

    public float getValeTransporte() { return valeTransporte.getValor(); }

    public Integer getPorcentagemBonus () { return porcentagemBonus; }

}
