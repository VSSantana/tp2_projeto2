package testes.dominio;

import dominios.ValorMonetario;

import static org.junit.jupiter.api.Assertions.*;

class ValorMonetarioTest {

    @org.junit.jupiter.api.Test
    void setValorValido () {

        float valor = 26.97f;
        ValorMonetario valorMonetario = new ValorMonetario();

        valorMonetario.setValor(valor);

        assertEquals(valor, valorMonetario.getValor());

    }

    @org.junit.jupiter.api.Test
    void setValorInvalidoNegativo () {

        float valor = -26.97f;
        ValorMonetario valorMonetario = new ValorMonetario();

        try {

            valorMonetario.setValor(valor);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O valor não pode ser negativo.", exception.getMessage());

        }

    }

}