package testes.entidade;

import entidades.TipoEmpregado;

import static org.junit.jupiter.api.Assertions.*;

class TipoEmpregadoTest {

    @org.junit.jupiter.api.Test
    void setTipoEmpregadoValudo () {

        Integer cod = 5;
        String tipo = "Consultor";
        float salario = 21000.00f;
        float valeTransporte = 0;
        Integer bonus = 0;
        TipoEmpregado tipoEmpregado = new TipoEmpregado();

        tipoEmpregado.setTipoEmpregado(cod, tipo, salario, valeTransporte, bonus);

        assertEquals(cod, tipoEmpregado.getCod());
        assertEquals(tipo.toUpperCase(), tipoEmpregado.getTipo());
        assertEquals(salario, tipoEmpregado.getSalario());
        assertEquals(valeTransporte, tipoEmpregado.getValeTransporte());
        assertEquals(bonus, tipoEmpregado.getPorcentagemBonus());

    }

}