package entidades;

import dominios.ValorMonetario;

public class FuncaoDirecao extends Funcao {

    private ValorMonetario valorBonus = new ValorMonetario();

    public FuncaoDirecao () { }

    public void setFuncaoDirecao (String nome, float salario, float bonus) {

        super.setFuncao(nome, salario);

        this.valorBonus.setValor(bonus);

    }

    public String getNome () { return super.getNome(); }
    public float getSalario () { return super.getSalario(); }
    public float getValorBonus () { return valorBonus.getValor(); }

}
