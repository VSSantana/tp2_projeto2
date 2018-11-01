package testes.dominio;

import dominios.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void setCPF() {

        String cpfPessoa = "03579526189";
        CPF cpf = new CPF();

        cpf.setCPF(cpfPessoa);


    }

}