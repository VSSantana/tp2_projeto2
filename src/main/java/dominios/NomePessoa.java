package dominios;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NomePessoa {

    private String nome;

    public NomePessoa() {}

    public void setNome (String nome) {

        validarNome(nome);

        this.nome = nome.toUpperCase();

    }

    private void validarNome (String nome) {

        int nomeSize = 100;

        if (nome == null || nome.length() > nomeSize || nome.isEmpty()) {

            throw new IllegalArgumentException("NomePessoa não deve ser nulo ou maior que 100 caracteres.");

        }

        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(nome);

        if(matcher.find()){

            throw new IllegalArgumentException("O nome não deve conter números.");

        }

        Pattern patternName = Pattern.compile("^((\\b[A-zÀ-ú']{2,40}\\b)\\s*){2,}$");
        Matcher matcherName = patternName.matcher(nome);

        if(!matcherName.matches()){

            throw new IllegalArgumentException("O nome não deve conter símbolos e deve ser completo.");

        }

    }

    public String getNome () { return nome; }

}
