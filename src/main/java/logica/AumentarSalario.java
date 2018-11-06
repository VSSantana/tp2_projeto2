package logica;

import database.Delete;
import database.Insert;
import database.Query;
import database.Update;
import entidades.TipoEmpregado;

import java.sql.Connection;

public class AumentarSalario {

    private Connection connection;

    public AumentarSalario (Connection connection) {

        this.connection = connection;

    }

    public void aumentarSalario (String funcao, float novoSalario) {

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
