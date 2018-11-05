package entidades;

import dominios.Cod;
import dominios.Data;

import java.sql.Date;

public class VinculoEmpregaticio {

    private Cod cod = new Cod();
    private Cod codEmpregado = new Cod();
    private Cod codTipoEmpregado = new Cod();
    private Cod codSetor = new Cod();
    private Data dataInicio = new Data();
    private Data dataFim = new Data();

    public VinculoEmpregaticio () { }

    public void setVinculoEmpregaticio (Integer cod,
                                        Integer codEmpregado,
                                        Integer codTipoEmpregado,
                                        Integer codSetor,
                                        Date dataInicio,
                                        Date dataFim) {

        this.cod.setCod(cod);
        this.codEmpregado.setCod(codEmpregado);
        this.codTipoEmpregado.setCod(codTipoEmpregado);
        this.codSetor.setCod(codSetor);
        this.dataInicio.setData(dataInicio);
        this.dataFim.setData(dataFim);

    }

    public Integer getCod () { return cod.getCod(); }
    public Integer getCodEmpregado () { return codEmpregado.getCod(); }
    public Integer getCodTipoEmpregado () { return codTipoEmpregado.getCod(); }
    public Integer getCodSetor () { return  codSetor.getCod(); }
    public Date getDataInicio () { return dataInicio.getDate(); }
    public Date getDataFim () { return dataFim.getDate(); }

}
