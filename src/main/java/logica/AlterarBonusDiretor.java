package logica;

import database.Query;
import database.Update;
import entidades.TipoEmpregado;

import java.sql.Connection;

public class AlterarBonusDiretor {

    private Connection connection;

    public AlterarBonusDiretor (Connection connection) {

        this.connection = connection;

    }

    public void alterarBonusDiretor (String tipoDiretor, int porcentagemBonus) {

        Integer cod;
        TipoEmpregado tipoEmpregado;
        Query query = new Query(connection);
        Update update = new Update(connection);

        if (tipoDiretor.toUpperCase().contains("DIRETOR")) {

            cod = query.retornaCodTipoEmpregado(tipoDiretor);

            tipoEmpregado = query.retornaRegistroTipoEmpregado(cod);

            update.atualizarTipoEmpregado(tipoEmpregado.getCod(),
                    tipoEmpregado.getTipo(),
                    tipoEmpregado.getSalario(),
                    tipoEmpregado.getValeTransporte(),
                    porcentagemBonus);

        } else {

            throw new IllegalArgumentException ("O cargo informado não corresponde ao de um Diretor.");

        }

    }

}
