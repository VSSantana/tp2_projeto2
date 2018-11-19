package logica;

import database.Query;
import database.Update;
import entidades.VinculoEmpregaticio;

import java.sql.Connection;
import java.sql.Date;

public class DemitirEmpregado {

    private Connection connection;

    public DemitirEmpregado (Connection connection) {

        this.connection = connection;

    }

    public void closeConnection () {

        try {

            connection.close();

        } catch (Exception exception) {

            throw new NullPointerException("Não foi possível fechar a conexão com o banco de dados.");

        }

    }

    public void demitirFuncionario (Integer codEmpregado, Date dataDesligamento) {

        Integer codVinculoEmpregaticioAtivo;
        VinculoEmpregaticio vinculo;
        Query query = new Query(connection);
        Update update = new Update(connection);

        codVinculoEmpregaticioAtivo = query.retornaCodVinculoEmpregaticioAtivo(codEmpregado);
        vinculo = query.retornaRegistroVinculoEmpregaticio(codVinculoEmpregaticioAtivo);

        update.atualizarVinculoEmpregaticio(codVinculoEmpregaticioAtivo,
                                            vinculo.getCodTipoEmpregado(),
                                            vinculo.getCodSetor(),
                                            vinculo.getDataInicio(),
                                            dataDesligamento);

    }

}
