package dominios;

public class ValorMonetario {

    private float valor;

    public ValorMonetario () {}

    public void setValor (float valor) {

        validarValor(valor);

        this.valor = valor;

    }

    private void validarValor (float valor) {

        if (valor < 0) {

            throw new IllegalArgumentException("O valor não pode ser negativo.");

        }

    }

    public float getValor () { return valor; }

}
