package logica;

import database.Query;

import java.sql.Connection;
import java.util.ArrayList;

public class ValidarQualificao {

    private Connection connection;

    public ValidarQualificao (Connection connection) {

        this.connection = connection;

    }

    boolean validarFormacaoSetor (String pSetor, int pCodEmpregado) {

        Query consulta = new Query(connection);

        ArrayList<String> cursosEmpregado = consulta.retornaCursosEmpregado(pCodEmpregado);
        ArrayList<String> cursosFinancas = new ArrayList<>();
        ArrayList<String> cursosMarketing = new ArrayList<>();
        ArrayList<String> cursosTecnologia = new ArrayList<>();
        ArrayList<String> cursosNormatividade = new ArrayList<>();
        ArrayList<String> cursosDesign = new ArrayList<>();

        if (cursosEmpregado == null || cursosEmpregado.isEmpty()) {

            return false;

        }

        cursosFinancas.add("ADMINISTRAÇÃO");
        cursosFinancas.add("ECONOMIA");
        cursosFinancas.add("CIÊNCIAS CONTÁBEIS");

        cursosMarketing.add("COMUNICAÇÃO SOCIAL");
        cursosMarketing.add("ADMINISTRAÇÃO");
        cursosMarketing.add("MARKETING");

        cursosTecnologia.add("ENGENHARIA DA COMPUTAÇÃO");
        cursosTecnologia.add("ENGENHARIA DE SISTEMAS");
        cursosTecnologia.add("ENGENHARIA DA INFORMAÇÃO");

        cursosNormatividade.add("DIREITO");
        cursosNormatividade.add("COMUNICAÇÃO SOCIAL");
        cursosNormatividade.add("CIÊNCIAS CONTÁBEIS");

        cursosDesign.add("DESIGN GRÁFICO");
        cursosDesign.add("DESIGN MULTIMIDIA");
        cursosDesign.add("ENGENHARIA SOCIAL");

        if (pSetor.equals("FINANÇAS")) {

            for (String vCurso : cursosEmpregado) {

                if (cursosFinancas.contains(vCurso.toUpperCase())) {

                    return true;

                }

            }

        }

        if (pSetor.equals("MARKETING")) {

            for (String vCurso : cursosEmpregado) {

                if (cursosFinancas.contains(vCurso.toUpperCase())) {

                    return true;

                }

            }

        }

        if (pSetor.equals("TECNOLOGIA")) {

            for (String vCurso : cursosEmpregado) {

                if (cursosFinancas.contains(vCurso.toUpperCase())) {

                    return true;

                }

            }

        }

        if (pSetor.equals("NORMATIVIDADE")) {

            for (String vCurso : cursosEmpregado) {

                if (cursosFinancas.contains(vCurso.toUpperCase())) {

                    return true;

                }

            }

        }

        if (pSetor.equals("DESIGN")) {

            for (String vCurso : cursosEmpregado) {

                if (cursosFinancas.contains(vCurso.toUpperCase())) {

                    return true;

                }

            }

        }

        return false;

    }

}
