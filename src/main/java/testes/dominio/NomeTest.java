package testes.dominio;

import dominios.Nome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NomeTest {

    @org.junit.jupiter.api.Test
    void setNome() {

        String nomePessoa = "Marcos Roberto Silveira Reis";
        Nome nome = new Nome();

        nome.setNome(nomePessoa);

        assertEquals (nomePessoa.toUpperCase(), nome.getNome());

    }

    @org.junit.jupiter.api.Test
    void setNomeInvalidoMuitoGrande() throws IllegalArgumentException {

        String nomePessoa = "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga";
        Nome nome = new Nome();

        nome.setNome(nomePessoa);

    }

}