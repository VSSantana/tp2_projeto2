package webservice;

import entidades.Curso;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CompanyServer {

    @WebMethod public String getCurso (int pCodColaborador);
    @WebMethod public String getNome (int pCodColaborador);
    @WebMethod public int getIdade (int pCodColaborador);
    @WebMethod public String getCpf (int pCodColaborador);
    @WebMethod public String getIdentificadorEmpresa (int pCodColaborador);
    @WebMethod public String getDataNascimento (int pCodColaborador);
    @WebMethod public String getSetorEmpregado (int pCodColaborador);
    @WebMethod public String getCargoEmpregado (int pCodColaborador);
    @WebMethod public String getNivelFormacao (int pCodColaborador);
    @WebMethod public void demitirEmpregado (int pCodEmpregado, String pData);
    @WebMethod public int numeroEmpregadosAtivos ();

}
