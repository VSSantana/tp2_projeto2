package dominios;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IdentificadorEmpresa {

    String identificadorEmpresa;

    public IdentificadorEmpresa() { }

    public void setIdentificadorEmpresa (String identificadorEmpresa) {

        validarIdentificadorEmpresa(identificadorEmpresa);

        this.identificadorEmpresa = identificadorEmpresa;

    }

    void validarIdentificadorEmpresa (String identificadorEmpresa) {

        if (identificadorEmpresa == null || identificadorEmpresa.length() != 10) {

            throw new IllegalArgumentException("O código da empresa deve ter 10 dígitos.");

        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(identificadorEmpresa);

        if(!matcher.matches()){

            throw new IllegalArgumentException("O código da empresa deve conter apenas números.");

        }

    }

    public String getIdentificadorEmpresaEmpresa () { return identificadorEmpresa; }

}
