package testes.entidade;

import entidades.VinculoEmpregaticio;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class VinculoEmpregaticioTest {

    @org.junit.jupiter.api.Test
    void setVinculoEmpregaticioValido () {

        Integer codVinculo = 15;
        Integer codEmpregado = 147;
        Integer codTipoEmpregado = 5;
        Integer codSetor = 3;
        Date dataInicio = Date.valueOf("2018-08-13");
        VinculoEmpregaticio vinculoEmpregaticio = new VinculoEmpregaticio();

        vinculoEmpregaticio.setVinculoEmpregaticio(codVinculo,
                                                   codEmpregado,
                                                   codTipoEmpregado,
                                                   codSetor,
                                                   dataInicio,
                                                   null);

        assertEquals(codVinculo, vinculoEmpregaticio.getCod());
        assertEquals(codEmpregado, vinculoEmpregaticio.getCodEmpregado());
        assertEquals(codTipoEmpregado, vinculoEmpregaticio.getCodTipoEmpregado());
        assertEquals(codSetor, vinculoEmpregaticio.getCodSetor());
        assertEquals(dataInicio, vinculoEmpregaticio.getDataInicio());
        assertEquals(null, vinculoEmpregaticio.getDataFim());

    }

}