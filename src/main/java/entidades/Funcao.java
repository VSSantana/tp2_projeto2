package entidades;

import dominios.ValorMonetario;

public class Funcao {

    private String nome;
    private ValorMonetario salario = new ValorMonetario();

    public Funcao () { }

    public void setFuncao (String nome,
                           float salario) {

        this.nome = nome.toUpperCase();
        this.salario.setValor(salario);

    }

    public String getNome () { return nome; }

    public float getSalario () { return salario.getValor(); }

}
