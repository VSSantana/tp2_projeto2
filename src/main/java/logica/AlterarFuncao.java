package logica;

import database.Query;
import database.Update;
import entidades.Empregado;
import entidades.VinculoEmpregaticio;

import java.sql.Connection;

public class AlterarFuncao {

    private Connection connection;

    public AlterarFuncao (Connection connection) {

        this.connection = connection;

    }

    public void alterarFuncao (String funcao, Integer codEmpregado) {

        Integer codTipoEmpregado;
        Integer codVinculoEmpregaticioAtivo;
        VinculoEmpregaticio vinculo;
        Empregado empregado;
        Query query = new Query(connection);
        Update update = new Update(connection);

        codTipoEmpregado = query.retornaCodTipoEmpregado(funcao);
        empregado = query.retornaRegistroEmpregado(codEmpregado);
        codVinculoEmpregaticioAtivo = query.retornaCodVinculoEmpregaticioAtivo(empregado.getCod());
        vinculo = query.retornaRegistroVinculoEmpregaticio(codVinculoEmpregaticioAtivo);

        update.atualizarVinculoEmpregaticio(codVinculoEmpregaticioAtivo,
                                            codTipoEmpregado,
                                            vinculo.getCodSetor(),
                                            vinculo.getDataInicio(),
                                            vinculo.getDataFim());

    }

}
