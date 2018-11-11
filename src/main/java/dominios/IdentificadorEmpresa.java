package dominios;

import database.Query;

import java.sql.Connection;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IdentificadorEmpresa {

    String identificadorEmpresa;

    public IdentificadorEmpresa() { }

    public void setIdentificadorEmpresa (String identificadorEmpresa) {

        validarIdentificadorEmpresa(identificadorEmpresa);

        this.identificadorEmpresa = identificadorEmpresa;

    }

    public String gerarIdentificador (Connection connection) {

        String randomNumber = null;
        int vRetornoExistencia = 1;
        Long firstPart;
        Long secondPart;
        Query consulta = new Query(connection);

        while (vRetornoExistencia != 0) {

            randomNumber = null;

            firstPart = (long) (Math.random() * 89999 + 10000);
            secondPart =  (long) (Math.random() * 89999 + 10000);

            randomNumber = firstPart.toString();
            randomNumber = randomNumber + secondPart.toString();

            vRetornoExistencia = consulta.retornaExiteIndentificadorEmpresa(randomNumber);

        }

        validarIdentificadorEmpresa(randomNumber);

        return randomNumber;

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
