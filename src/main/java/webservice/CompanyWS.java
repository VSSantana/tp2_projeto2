package webservice;

import database.ConnectSQLiteDatabase;
import database.Query;
import entidades.Curso;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.CompanyServer")
public class CompanyWS {

    public String getCurso (int pCodCurso) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Curso curso;
        Query consulta = new Query(connectSQLiteDatabase.dbConnect());

        curso = consulta.retornaRegistroCurso(pCodCurso);

        consulta.closeConnection();

        return curso.getNomeCurso();

    }

}
