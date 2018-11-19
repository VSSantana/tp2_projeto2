package webservice;

import javax.xml.ws.Endpoint;

public class CompanyServerPublisher {

    public static void main (String[] args) {

        Endpoint.publish("http://localhost:9876/webserver", new CompanyWS());
        System.out.println("Company webservice is online.");

    }

}
