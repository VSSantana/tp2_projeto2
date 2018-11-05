package testes.entidade;

import entidades.Setor;

import static org.junit.jupiter.api.Assertions.*;

class SetorTest {

    @org.junit.jupiter.api.Test
    void setSetorValido () {

        Integer codSetor = 87;
        Integer codDiretor = 5;
        String nomeSetor = "Compras";
        Setor setor = new Setor();

        setor.setSetor(codSetor, codDiretor, nomeSetor);

        assertEquals(codSetor, setor.getCod());
        assertEquals(codDiretor, setor.getCodDiretor());
        assertEquals(nomeSetor.toUpperCase(), setor.getNome());

    }

}