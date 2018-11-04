package dominios;

public class Cod {

    private Integer cod;

    public void Cod () { }

    public void setCod (Integer cod) {

        validarCod(cod);

        this.cod = cod;

    }

    void validarCod (Integer cod) {

        if (cod != null && cod <= 0) {

            throw new IllegalArgumentException("Chave de registro inválida.");

        }

    }

    public Integer getCod () { return cod; }

}
