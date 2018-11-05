package entidades;

import dominios.Cod;

public class CursoEmpregado {

    private Cod cod = new Cod();
    private Cod codEmpregado = new Cod();
    private Cod codCurso = new Cod();

    public CursoEmpregado () { }

    public void setCursoEmpregado (Integer cod,
                                   Integer codEmpregado,
                                   Integer codCurso) {

        this.cod.setCod(cod);
        this.codEmpregado.setCod(codEmpregado);
        this.codCurso.setCod(codCurso);

    }

    public Integer getCod () { return cod.getCod(); }
    public Integer getCodEmpregado () { return codEmpregado.getCod(); }
    public Integer getCodCurso () { return codCurso.getCod(); }

}
