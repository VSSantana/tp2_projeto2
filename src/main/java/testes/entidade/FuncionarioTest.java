package testes.entidade;

import entidades.Funcionario;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @org.junit.jupiter.api.Test
    void setFuncionario () {

        String nomePessoa = "Marcos Roberto Silveira Reis";
        int idadePessoa = 17;
        Date dataNascimentoPessoa = Date.valueOf("1994-09-03");
        String cpfPessoa = "55489761172";
        String nivelFormacaoPessoa = "Ensino Médio";
        String areaFormacaoPessoa = "";
        String codEmpresaPessoa = "9284287319";
        Date dataAdmissaoPessoa = Date.valueOf("2018-08-13");
        int codSetorPessoa = 19;
        String statusPessoa = "ATIVO";
        Funcionario funcionario = new Funcionario();

        funcionario.setFuncionario(nomePessoa,
                                   idadePessoa,
                                   dataNascimentoPessoa,
                                   cpfPessoa,
                                   nivelFormacaoPessoa,
                                   areaFormacaoPessoa,
                                   codEmpresaPessoa,
                                   dataAdmissaoPessoa,
                                   null,
                                   codSetorPessoa,
                                   statusPessoa);

        assertEquals(nomePessoa.toUpperCase(), funcionario.getNome());
        assertEquals(idadePessoa, funcionario.getIdade());
        assertEquals(dataNascimentoPessoa, funcionario.getDataNascimento());
        assertEquals(cpfPessoa, funcionario.getCpf());
        assertEquals(nivelFormacaoPessoa, funcionario.getNivelFormacao());
        assertEquals(areaFormacaoPessoa, funcionario.getAreaFormacao());
        assertEquals(codEmpresaPessoa, funcionario.getCodEmpresa());
        assertEquals(dataAdmissaoPessoa, funcionario.getDataAdmissao());
        assertEquals(null, funcionario.getDataDesligamento());
        assertEquals(codSetorPessoa, funcionario.getCodSetor());
        assertEquals(statusPessoa, funcionario.getStatus());

    }

}