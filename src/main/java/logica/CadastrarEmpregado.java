package logica;

import database.Query;
import dominios.IdentificadorEmpresa;
import entidades.Empregado;

import java.sql.Connection;
import java.sql.Date;

public class CadastrarEmpregado {

    private Connection connection;

    public CadastrarEmpregado (Connection connection) {

        this.connection = connection;

    }

    // Níveis de formação:

    // "1º GRAU (ENSINO FUNDAMENTAL)"
    // "2º GRAU (ENSINO MÉDIO)"
    // "3º GRAU (ENSINO SUPERIOR)"
    // "2º GRAU (CURSO TÉCNICO)"

    // Cursos:

    // "ADMINISTRAÇÃO"
    // "CIÊNCIAS CONTÁBEIS"
    // "COMUNICAÇÃO SOCIAL"
    // "ECONOMIA"
    // "MARKETING"
    // "ENGENHARIA DA COMPUTAÇÃO"
    // "ENGENHARIA DE SISTEMAS"
    // "ENGENHARIA DA INFORMAÇÃO"
    // "DIREITO"
    // "DESIGN GRÁFICO"
    // "DESIGN DE MULTIMIDIA"
    // "ENGENHARIA SOCIAL"

    // TIpo empregado:

    // "AUXILIAR"
    // "TÉCNICO"
    // "PROFISSIONAL"
    // "DIRETOR DE SETOR"
    // "DIRETOR DE OPERAÇÕES"
    // "DIRETOR EXECUTIVO"

    // Setores:

    // "FINANÇAS"
    // "MARKETING"
    // "TECNOLOGIA"
    // "NORMATIVIDADE"
    // "DESIGN"

    public int cadastrarNovoEmpregado (String pNome,
                                       int pIdade,
                                       String pCpf,
                                       Date pDataNascimento,
                                       String pNivelFormacao,
                                       String pCurso,
                                       String pTipoEmpregado,
                                       String pSetor,
                                       Date pDataAdmissao){

        int vRetorno = -1;
        Query consulta = new Query(connection);
        Empregado empregado = new Empregado();

        try {

            int vCodNivelFormacao = consulta.retornaCodNivelFormacao(pNivelFormacao);
            String vIdentificadorEmpresa = new IdentificadorEmpresa().gerarIdentificador(connection);
            empregado.setEmpregado(null,
                                    vCodNivelFormacao,
                                    vIdentificadorEmpresa,
                                    pNome,
                                    pIdade,
                                    pCpf,
                                    pDataNascimento);

        } catch (Exception exception) {

            throw new IllegalArgumentException("Erro nos parâmetros passados.");

        }

        vRetorno = 0;

        return vRetorno;

    }


}
