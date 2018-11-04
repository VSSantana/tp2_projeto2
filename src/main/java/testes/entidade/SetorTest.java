package testes.entidade;

import entidades.Setor;

import static org.junit.jupiter.api.Assertions.*;

class SetorTest {

    @org.junit.jupiter.api.Test
    void setSetorValido () {

        Integer codSetor = 87;
        String nomeSetor = "Compras";
        Setor setor = new Setor();

        setor.setSetor(codSetor, nomeSetor);

        assertEquals(codSetor, setor.getCod());
        assertEquals(nomeSetor.toUpperCase(), setor.getNome());

    }

}