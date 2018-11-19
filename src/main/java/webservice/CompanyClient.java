package webservice;

import database.ConnectSQLiteDatabase;
import database.Query;
import logica.CadastrarEmpregado;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.sql.Date;

public class CompanyClient {

    public static void main(String args[]) throws Exception {

        URL url = new URL("http://localhost:9876/webserver?wsdl");
        QName qname = new QName("http://webservice/","CompanyWSService");
        Service ws = Service.create(url, qname);
        CompanyServer server = ws.getPort(CompanyServer.class);
        int codEmpregado = 14;
        Date vDataAdmissao = Date.valueOf("2018-11-23");
        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Query consulta = new Query(connectSQLiteDatabase.dbConnect());
        int vNumeroEmpregados = consulta.retornaNumeroEmpregadosAtivos();
        consulta.closeConnection();

        System.out.println("Número de empregados na empresa: " + vNumeroEmpregados + "\n");
        System.out.println("Número de empregados na empresa de origem: "+ server.numeroEmpregadosAtivos() + "\n");

        System.out.println("Empregado a ser trasnferido: \n");

        System.out.println("Nome: " + server.getNome(codEmpregado));
        System.out.println("Idade: " + server.getIdade(codEmpregado));
        System.out.println("Cpf: " + server.getCpf(codEmpregado));
        System.out.println("Identificador empresa: " + server.getIdentificadorEmpresa(codEmpregado));
        System.out.println("Data de nascimento: " + server.getDataNascimento(codEmpregado));
        System.out.println("Nivel formação: " + server.getNivelFormacao(codEmpregado));
        System.out.println("Curso: " + server.getCurso(codEmpregado));
        System.out.println("Setor: " + server.getSetorEmpregado(codEmpregado));
        System.out.println("Cargo: " + server.getCargoEmpregado(codEmpregado));

        CadastrarEmpregado cadastrarEmpregado = new CadastrarEmpregado(connectSQLiteDatabase.dbConnect());

        String curso = server.getCurso(codEmpregado);

        if (curso.equals("NULL")) {

            curso = null;

        }

        cadastrarEmpregado.cadastrarNovoEmpregado(server.getNome(codEmpregado),
                server.getIdade(codEmpregado),
                server.getCpf(codEmpregado),
                Date.valueOf(server.getDataNascimento(codEmpregado)),
                server.getNivelFormacao(codEmpregado),
                curso,
                server.getCargoEmpregado(codEmpregado),
                server.getSetorEmpregado(codEmpregado),
                vDataAdmissao);

        System.out.println("\nEmpregado cadastrado na empresa.\n");

        consulta = new Query(connectSQLiteDatabase.dbConnect());
        vNumeroEmpregados = consulta.retornaNumeroEmpregadosAtivos();
        consulta.closeConnection();

        System.out.println("Número de empregados na empresa: " + vNumeroEmpregados + "\n");

        server.demitirEmpregado(codEmpregado, String.valueOf(vDataAdmissao));

        System.out.println("Número de empregados na empresa de origem: "+ server.numeroEmpregadosAtivos() + "\n");

        System.out.println("Empregado demitido da empresa de origem. \n");

    }

}
