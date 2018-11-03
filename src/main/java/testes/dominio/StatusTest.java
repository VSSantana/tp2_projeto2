package testes.dominio;

import dominios.Status;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {

    @org.junit.jupiter.api.Test
    void setStatusValido () {

        String statusPessoa = "Ativo";
        Status status = new Status();

        status.setStatus(statusPessoa);

        assertEquals(statusPessoa.toUpperCase(), status.getStatus());

        statusPessoa = "Inativo";

        status.setStatus(statusPessoa);

        assertEquals(statusPessoa.toUpperCase(), status.getStatus());

    }

    @org.junit.jupiter.api.Test
    void setStatusInvalidoNulo () {

        String statusPessoa = null;
        Status status = new Status();

        try {

            status.setStatus(statusPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Status inválido.", exception.getMessage());

        }

        statusPessoa = "";

        try {

            status.setStatus(statusPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Status inválido.", exception.getMessage());

        }

    }

    @org.junit.jupiter.api.Test
    void setStatusInvalidoDesconhecido () {

        String statusPessoa = "PERDIDO";
        Status status = new Status();

        try {

            status.setStatus(statusPessoa);
            fail("A execeção esperada não foi lançada.");

        } catch (IllegalArgumentException exception) {

            assertEquals("Status inválido.", exception.getMessage());

        }

    }

}