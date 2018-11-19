package webservice;

import database.ConnectSQLiteDatabase;
import database.Query;
import logica.DadosColaborador;
import logica.DemitirEmpregado;

import javax.jws.WebService;
import java.sql.Date;

@WebService(endpointInterface = "webservice.CompanyServer")
public class CompanyWS {


    public String getNome (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getNomeColaborador();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public int getIdade (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        int vRetorno = dadosColaborador.getIdadeColaborador();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getCpf (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getCpfColaborador();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getIdentificadorEmpresa (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getIdentificadorColaboradorEmpresa();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getDataNascimento (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = String.valueOf(dadosColaborador.getDataNascimentoColaborador());

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getSetorEmpregado (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getSetorColaborador();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getCargoEmpregado (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getCargoColaborador();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getNivelFormacao (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getNivelFormacaoEmpregado();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public String getCurso (int pCodColaborador) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DadosColaborador dadosColaborador = new DadosColaborador(connectSQLiteDatabase.dbConnect());

        dadosColaborador.recuperaDados(pCodColaborador);

        String vRetorno = dadosColaborador.getCursoEmpregado();

        dadosColaborador.closeConnection();

        return vRetorno;

    }

    public void demitirEmpregado (int pCodEmpregado, String pData) {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        DemitirEmpregado demitirEmpregado = new DemitirEmpregado(connectSQLiteDatabase.dbConnect());

        demitirEmpregado.demitirFuncionario(pCodEmpregado, Date.valueOf(pData));

        demitirEmpregado.closeConnection();

    }

    public int numeroEmpregadosAtivos () {

        ConnectSQLiteDatabase connectSQLiteDatabase = new ConnectSQLiteDatabase();
        Query consulta = new Query(connectSQLiteDatabase.dbConnect());
        int vNumeroEmpregadosAtivos = consulta.retornaNumeroEmpregadosAtivos();

        consulta.closeConnection();

        return vNumeroEmpregadosAtivos;

    }

}
