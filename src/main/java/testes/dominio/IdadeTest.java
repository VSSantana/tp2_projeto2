package testes.dominio;

import dominios.Idade;

import static org.junit.jupiter.api.Assertions.*;

class IdadeTest {

    @org.junit.jupiter.api.Test
    void setIdadeValida () {

        int idadePessoa = 26;
        Idade idade = new Idade();

        idade.setIdade(idadePessoa);

        assertEquals(idadePessoa, idade.getIdade());

    }

    @org.junit.jupiter.api.Test
    void setIdadeInvalidaQuatroDigitos () {

        int idadePessoa = 1100;
        Idade idade = new Idade();

        try {

            idade.setIdade(idadePessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Idade não pode ser inferior à 16 ou superior à 120 anos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setIdadeInvalidaUmDigito () {

        int idadePessoa = 1;
        Idade idade = new Idade();

        try {

            idade.setIdade(idadePessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Idade não pode ser inferior à 16 ou superior à 120 anos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setIdadeInvalidaNula () {

        int idadePessoa = 1;
        Idade idade = new Idade();

        try {

            idade.setIdade(idadePessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Idade não pode ser inferior à 16 ou superior à 120 anos.", exception.getMessage());

        }

    }

}