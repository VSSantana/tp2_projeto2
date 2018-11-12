package logica;

import database.Query;

import java.sql.Connection;
import java.util.ArrayList;

public class Projeto4 {

    //Número de empregados que ganham menos de 6000 reais.

    private Connection connection;

    public Projeto4 (Connection connection) {

        this.connection = connection;

    }

    public float calcularPorcentagem (float pValor) {

        Query consulta = new Query(connection);
        int numeroEmpregados = 0;
        int totalEmpregados = 0;
        float porcentagem = 0;
        ArrayList<Integer> funcoes = consulta.retornaFuncoesSalarioMenor(pValor);

        totalEmpregados = consulta.retornaNumeroEmpregadosAtivos();

        for (int i : funcoes) {

            numeroEmpregados = numeroEmpregados + consulta.retornaNumeroEmpregadosFuncao(i);

        }

        porcentagem = (float) (numeroEmpregados * 100)/totalEmpregados;

        consulta.closeConnection();

        return porcentagem;

    }

}
