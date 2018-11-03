package dominios;

public class Status {

    private String status;

    public void Status () {}

    public void setStatus (String status) {

        validarStatus(status);

        this.status = status.toUpperCase();

    }

    void validarStatus (String status) {

        if (status == null || (!status.toUpperCase().equals("ATIVO") && !status.toUpperCase().equals("INATIVO"))) {

            throw new IllegalArgumentException("Status inválido.");

        }

    }

    public String getStatus () { return status; }

}
