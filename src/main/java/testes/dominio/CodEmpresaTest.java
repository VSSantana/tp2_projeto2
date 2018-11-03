package testes.dominio;

import dominios.CodEmpresa;

import static org.junit.jupiter.api.Assertions.*;

class CodEmpresaTest {

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoMaisDeDezDigitos () {

        String codEmpresaPessoa = "12353527869";
        CodEmpresa codEmpresa = new CodEmpresa();

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaValido () {

        String codEmpresaPessoa = "1235352786";
        CodEmpresa codEmpresa = new CodEmpresa();

        codEmpresa.setCodEmpresa(codEmpresaPessoa);

        assertEquals(codEmpresaPessoa, codEmpresa.getCodEmpresa());

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComLetra () {

        String codEmpresaPessoa = "1235A52786";
        CodEmpresa codEmpresa = new CodEmpresa();

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComSimbolo () {

        String codEmpresaPessoa = "1235@52786";
        CodEmpresa codEmpresa = new CodEmpresa();

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComEspaco () {

        String codEmpresaPessoa = "12353 2786";
        CodEmpresa codEmpresa = new CodEmpresa();

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoNulo () {

        String codEmpresaPessoa = null;
        CodEmpresa codEmpresa = new CodEmpresa();

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

        codEmpresaPessoa = "";

        try {

            codEmpresa.setCodEmpresa(codEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

    }

}