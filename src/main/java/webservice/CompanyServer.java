package webservice;

import entidades.Curso;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CompanyServer {

    @WebMethod public String getCurso (int pCodCurso);

}
