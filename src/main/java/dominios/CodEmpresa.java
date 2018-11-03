package dominios;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CodEmpresa {

    String codEmpresa;

    public CodEmpresa () { }

    public void setCodEmpresa (String codEmpresa) {

        validarCodEmpresa(codEmpresa);

        this.codEmpresa = codEmpresa;

    }

    void validarCodEmpresa (String codEmpresa) {

        if (codEmpresa == null || codEmpresa.length() != 10) {

            throw new IllegalArgumentException("O código da empresa deve ter 10 dígitos.");

        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(codEmpresa);

        if(!matcher.matches()){

            throw new IllegalArgumentException("O código da empresa deve conter apenas números.");

        }

    }

    public String getCodEmpresa () { return codEmpresa; }

}
