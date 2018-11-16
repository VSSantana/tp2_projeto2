package webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CompanyClient {

    public static void main(String args[]) throws Exception {

        URL url = new URL("http://192.168.0.105:9876/webserver?wsdl");
        QName qname = new QName("http://webservice/","CompanyWSService");
        Service ws = Service.create(url, qname);
        CompanyServer server = ws.getPort(CompanyServer.class);

        System.out.println("Curso 1: " + server.getCurso(1));

    }

}
