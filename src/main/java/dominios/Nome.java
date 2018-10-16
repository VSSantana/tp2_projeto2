package dominios;

public class Nome {

    private String nome;
    private int nomeSize = 100;

    void SetNome (String nome) {

        ValidarNome(nome);

        this.nome = nome;

    }

    void ValidarNome (String nome) {

        if (nome.length() > nomeSize || nome.isEmpty()) {

            throw new IllegalArgumentException("Nome não deve ser nulo ou maior que 100 caracteres.");

        }

    }

}
