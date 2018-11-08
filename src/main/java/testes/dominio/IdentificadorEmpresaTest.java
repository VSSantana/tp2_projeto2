package testes.dominio;

import database.ConnectSQLiteDatabase;
import dominios.IdentificadorEmpresa;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class IdentificadorEmpresaTest {

    @org.junit.jupiter.api.Test
    void setIdentificadorEmpresaInvalidoMaisDeDezDigitos () {

        String identificadorEmpresaPessoa = "12353527869";
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaValido () {

        String identificadorEmpresaPessoa = "1235352786";
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);

        assertEquals(identificadorEmpresaPessoa, identificadorEmpresa.getIdentificadorEmpresaEmpresa());

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComLetra () {

        String identificadorEmpresaPessoa = "1235A52786";
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComSimbolo () {

        String identificadorEmpresaPessoa = "1235@52786";
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoComEspaco () {

        String identificadorEmpresaPessoa = "12353 2786";
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve conter apenas números.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setCodEmpresaInvalidoNulo () {

        String identificadorEmpresaPessoa = null;
        IdentificadorEmpresa identificadorEmpresa = new IdentificadorEmpresa();

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

        identificadorEmpresaPessoa = "";

        try {

            identificadorEmpresa.setIdentificadorEmpresa(identificadorEmpresaPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("O código da empresa deve ter 10 dígitos.", exception.getMessage());

        }

    }

}