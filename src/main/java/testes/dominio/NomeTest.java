package testes.dominio;

import dominios.Nome;

import static org.junit.jupiter.api.Assertions.*;

class NomeTest {

    @org.junit.jupiter.api.Test
    void setNomeValido () {

        String nomePessoa = "Marcos Roberto Silveira Reis";
        Nome nome = new Nome();

        nome.setNome(nomePessoa);

        assertEquals(nomePessoa.toUpperCase(), nome.getNome());

    }

    @org.junit.jupiter.api.Test
    void setNomeInvalidoComNumeros () {

        String nomePessoa = "Marcos Roberto Silveira Reis 1";
        Nome nome = new Nome();

        try {

            nome.setNome(nomePessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O nome não deve conter números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setNomeInvalidoMuitoGrande() throws IllegalArgumentException {

        String nomePessoa = "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga";
        Nome nome = new Nome();

        try {

            nome.setNome(nomePessoa);

            fail("A exceção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Nome não deve ser nulo ou maior que 100 caracteres.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setNomeInvalidoNulo() throws IllegalArgumentException {

        String nomePessoa = "";
        Nome nome = new Nome();

        try {

            nome.setNome(nomePessoa);

            fail("A exceção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Nome não deve ser nulo ou maior que 100 caracteres.", exception.getMessage());

        }

        nomePessoa = null;

        try {

            nome.setNome(nomePessoa);

            fail("A exceção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Nome não deve ser nulo ou maior que 100 caracteres.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setNomeInvalidoComSimbolos () {

        String nomePessoa = "M@rcos Roberto Silveira Reis";
        Nome nome = new Nome();

        try {

            nome.setNome(nomePessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O nome não deve conter símbolos.", exception.getMessage());

        }

    }

}