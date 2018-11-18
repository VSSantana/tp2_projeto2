package webservice;

import database.ConnectSQLiteDatabase;
import database.Query;
import entidades.Curso;
import logica.DadosColaborador;

import javax.jws.WebService;
import java.sql.Date;

@WebService(endpointInterface = "webservice.CompanyServer")
public class CompanyWS {


    public String getNome (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getNomeColaborador();

    }

    public int getIdade (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getIdadeColaborador();

    }

    public String getCpf (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getCpfColaborador();

    }

    public String getIdentificadorEmpresa (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getIdentificadorColaboradorEmpresa();

    }

    public String getDataNascimento (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return String.valueOf(dadosColaborador.getDataNascimentoColaborador());

    }

    public String getSetorEmpregado (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getSetorColaborador();

    }

    public String getCargoEmpregado (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getCargoColaborador();

    }

    public String getNivelFormacao (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getNivelFormacaoEmpregado();

    }

    public String getCurso (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        return dadosColaborador.getCursoEmpregado();

    }

}
