package testes.dominio;

import dominios.Cod;

import static org.junit.jupiter.api.Assertions.*;

class CodTest {

    @org.junit.jupiter.api.Test
    void setCodValido () {

        Integer key = 7;
        Cod cod = new Cod();

        cod.setCod(key);

        assertEquals(key, cod.getCod());

    }


    @org.junit.jupiter.api.Test
    void setCodNull () {

        Integer key = null;
        Cod cod = new Cod();

        cod.setCod(key);

        assertEquals(key, cod.getCod());

    }

    @org.junit.jupiter.api.Test
    void setCodInvalidoNegativo () {

        Integer key = -10;
        Cod cod = new Cod();

        try {

            cod.setCod(key);
            fail("A exceção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Chave de registro inválida.", exception.getMessage());

        }

    }

}