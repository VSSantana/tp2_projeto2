package testes.dominio;

import dominios.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void setCpfValido() {

        String cpfPessoa = "55489761172";
        Cpf cpf = new Cpf();

        cpf.setCpf(cpfPessoa);

        assertEquals(cpfPessoa, cpf.getCpf());

    }

    @org.junit.jupiter.api.Test
    void setCpfInvalido () {

        String cpfPessoa = "55489761171";
        Cpf cpf = new Cpf();

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf passado é inválido.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCpfInvalidoComLetra () {

        String cpfPessoa = "55489a61171";
        Cpf cpf = new Cpf();

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf deve conter apenas dígitos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCpfInvalidoComSimbolo () {

        String cpfPessoa = "55489@61171";
        Cpf cpf = new Cpf();

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf deve conter apenas dígitos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCpfInvalidoComEspaco () {

        String cpfPessoa = "55489 61171";
        Cpf cpf = new Cpf();

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf deve conter apenas dígitos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCpfInvalidoNulo () {

        String cpfPessoa = null;
        Cpf cpf = new Cpf();

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf é composto de 11 dígitos e deve ser inserido sem pontos e traços.", exception.getMessage());

        }

        cpfPessoa = "";

        try {

            cpf.setCpf(cpfPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O Cpf é composto de 11 dígitos e deve ser inserido sem pontos e traços.", exception.getMessage());

        }

    }


}