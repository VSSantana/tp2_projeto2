package dominios;

public class Idade {

    private int idade;

    public Idade () {}

    public void setIdade (int idade) {

        validarIdade(idade);

        this.idade = idade;

    }

    private void validarIdade (int idade) {

        if (idade > 120 || idade < 16) {

            throw new IllegalArgumentException("Idade não pode ser inferior à 16 ou superior à 120 anos.");

        }

    }

    public int getIdade () { return idade; }

}
