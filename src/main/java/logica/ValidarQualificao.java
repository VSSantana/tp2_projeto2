package logica;

import java.util.ArrayList;

public class ValidarQualificao {

    boolean validarFormacaoSetor (String pSetor, String pCurso) {

        ArrayList<String> cursosFinancas = new ArrayList<>();
        ArrayList<String> cursosMarketing = new ArrayList<>();
        ArrayList<String> cursosTecnologia = new ArrayList<>();
        ArrayList<String> cursosNormatividade = new ArrayList<>();
        ArrayList<String> cursosDesign = new ArrayList<>();

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

            if (cursosFinancas.contains(pCurso.toUpperCase())){

                return true;

            }

        }

        if (pSetor.equals("MARKETING")) {

            if (cursosMarketing.contains(pCurso.toUpperCase())){

                return true;

            }

        }

        if (pSetor.equals("TECNOLOGIA")) {

            if (cursosTecnologia.contains(pCurso.toUpperCase())){

                return true;

            }

        }

        if (pSetor.equals("NORMATIVIDADE")) {

            if (cursosNormatividade.contains(pCurso.toUpperCase())){

                return true;

            }

        }

        if (pSetor.equals("DESIGN")) {

            if (cursosDesign.contains(pCurso.toUpperCase())){

                return true;

            }

        }

        return false;

    }

}