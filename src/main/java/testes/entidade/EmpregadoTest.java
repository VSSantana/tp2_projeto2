package testes.entidade;

import entidades.Empregado;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpregadoTest {

    @org.junit.jupiter.api.Test
    void setFuncionario () {

        Integer codEmpregado = null;
        Integer codNivelFormacaoEmpregado = null;
        String identificadorEmpresaPessoa = "9284287319";
        String nomePessoa = "Marcos Roberto Silveira Reis";
        int idadePessoa = 17;
        String cpfPessoa = "55489761172";
        Date dataNascimentoPessoa = Date.valueOf("1994-09-03");
        Empregado empregado = new Empregado();

        empregado.setFuncionario(codEmpregado,
                                 codNivelFormacaoEmpregado,
                                 identificadorEmpresaPessoa,
                                 nomePessoa,
                                 idadePessoa,
                                 cpfPessoa,
                                 dataNascimentoPessoa);

        assertEquals(codEmpregado, empregado.getCod());
        assertEquals(codNivelFormacaoEmpregado, empregado.getCodNivelFormacao());
        assertEquals(identificadorEmpresaPessoa, empregado.getIdentificadorEmpresa());
        assertEquals(nomePessoa.toUpperCase(), empregado.getNomePessoa());
        assertEquals(idadePessoa, empregado.getIdade());
        assertEquals(cpfPessoa, empregado.getCpf());
        assertEquals(dataNascimentoPessoa, empregado.getDataNascimento());

    }

}