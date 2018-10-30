package dominios;

public class Nome {

    private String nome;
    private int nomeSize = 100;

    public Nome () {}

    public void setNome (String nome) {

        validarNome(nome);

        this.nome = nome.toUpperCase();

    }

    private void validarNome (String nome) {

        if (nome.length() > nomeSize || nome.isEmpty()) {

            throw new IllegalArgumentException("Nome não deve ser nulo ou maior que 100 caracteres.");

        }

    }

    public String getNome () { return nome; }

}
