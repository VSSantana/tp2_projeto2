package logica;

import database.Delete;
import database.Insert;
import database.Query;
import database.Update;
import entidades.TipoEmpregado;

import java.sql.Connection;

public class AlterarSalario {

    private Connection connection;

    public AlterarSalario(Connection connection) {

        this.connection = connection;

    }

    public void closeConnection () {

        try {

            connection.close();

        } catch (Exception exception) {

            throw new NullPointerException("Não foi possível fechar a conexão com o banco de dados.");

        }

    }

    public void alterarSalario (String funcao, float novoSalario) {

        Integer cod;
        TipoEmpregado tipoEmpregado;
        Query query = new Query(connection);
        Update update = new Update(connection);

        cod = query.retornaCodTipoEmpregado(funcao);

        tipoEmpregado = query.retornaRegistroTipoEmpregado(cod);

        update.atualizarTipoEmpregado(tipoEmpregado.getCod(),
                                      tipoEmpregado.getTipo(),
                                      novoSalario,
                                      tipoEmpregado.getValeTransporte(),
                                      tipoEmpregado.getPorcentagemBonus());

    }

}
