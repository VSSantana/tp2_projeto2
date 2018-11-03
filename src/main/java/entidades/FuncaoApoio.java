package entidades;

import dominios.ValorMonetario;

public class FuncaoApoio extends Funcao {

    private ValorMonetario valorValeTransporte = new ValorMonetario();

    public FuncaoApoio () { }

    public void setFuncaoApoio (String nome, float salario, float valeTransporte) {

        super.setFuncao(nome, salario);

        this.valorValeTransporte.setValor(valeTransporte);

    }

    public String getNome () { return super.getNome(); }
    public float getSalario () { return super.getSalario(); }
    public float getValorValeTransporte () { return valorValeTransporte.getValor(); }

}
