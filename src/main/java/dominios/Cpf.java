package dominios;

import java.util.ArrayList;

public class Cpf {

    private String cpf;

    public Cpf() {}

    public void setCpf (String cpf) {

        validarCpf(cpf);

        this.cpf = cpf;

    }

    void validarCpf (String pCpf) {

        int vTotal = 0;
        int vDigito = 0;
        Long vCPF;
        ArrayList<String> cpfsInvalidosComuns = new ArrayList<>();

        cpfsInvalidosComuns.add("00000000000");
        cpfsInvalidosComuns.add("11111111111");
        cpfsInvalidosComuns.add("22222222222");
        cpfsInvalidosComuns.add("33333333333");
        cpfsInvalidosComuns.add("44444444444");
        cpfsInvalidosComuns.add("55555555555");
        cpfsInvalidosComuns.add("66666666666");
        cpfsInvalidosComuns.add("77777777777");
        cpfsInvalidosComuns.add("88888888888");
        cpfsInvalidosComuns.add("99999999999");

        //Verifica se o tamando da string passada é com patível com o do cpf sem pontos e traços.

        if (pCpf == null || pCpf.length() != 11) {

            throw new IllegalArgumentException("O Cpf é composto de 11 dígitos e deve ser inserido sem pontos e traços.");

        }

        //A conversão para número testa quanto a string ser numérica.

        try {

            Long.parseLong(pCpf);

        } catch (NumberFormatException exception) {

            throw new IllegalArgumentException("O Cpf deve conter apenas dígitos.");

        }

        //Descarta os números usualmente usados.

        if (cpfsInvalidosComuns.contains(pCpf)) {

            throw new IllegalArgumentException("O Cpf passado é inválido.");

        }

        //Multiplica cada dígito de 1 a 9 do Cpf passado de acordo com seu peso correspondente (10 a 2) e soma os resultados.

       for (int i = 0; i < 9; i++) {

           vTotal = vTotal + Integer.parseInt(String.valueOf(pCpf.charAt(i))) * (11 - (i + 1));

       }

       //Determina o primeiro dígito de verificação. Se o dígito é maior que 9 então torna-se 0, caso contrário permanece o mesmo.

       vDigito = 11 - (vTotal % 11);

       if (vDigito > 9) {

           vDigito = 0;

       }

       //Avalia se o primeiro dígito verificador corresponde ao décimo dígito do Cpf.

       if (vDigito != Integer.parseInt(String.valueOf(pCpf.charAt(9)))) {

           throw new IllegalArgumentException("O Cpf passado é inválido.");

       }

       vDigito = 0;
       vTotal = 0;

       //Faz o mesmo processo para conferir se o segundo dígito verificador corresponde ao décimo primeiro dígito do Cpf.

       for (int i = 0; i < 10; i++) {

           vTotal = vTotal + Integer.parseInt(String.valueOf(pCpf.charAt(i))) * (12 - (i + 1));

       }

       vDigito = 11 - (vTotal % 11);

       if (vDigito > 9) {

           vDigito = 0;

       }

       if (vDigito != Integer.parseInt(String.valueOf(pCpf.charAt(10)))) {

           throw new IllegalArgumentException("O Cpf passado é inválido.");

       }

    }

    public String getCpf () { return cpf; }

}
