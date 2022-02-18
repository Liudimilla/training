package com.loiane.cursojava.aula53;
/* Constantes no Java
Enumeradores (Enum) */

public class TesteDiaSemana {
    public static void main(String[] args) {
        usandoConstantes();
        System.out.println();
        usandoEnum();
    }


    private static void usandoConstantes() {
        int segunda = DiaSemanaConstant.SEGUNDA;
        int terca = DiaSemanaConstant.TERCA;
        int quarta = DiaSemanaConstant.QUARTA;
        int quinta = DiaSemanaConstant.QUINTA;
        int sexta = DiaSemanaConstant.SEXTA;
        int sabado = DiaSemanaConstant.SABADO;
        int domingo = DiaSemanaConstant.DOMINGO;
//este utilizando constantes no Java
        System.out.println("Dia da Semana \n");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);

    }

    private static void imprimiDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terca-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;

        }
    }

    private static void usandoEnum() {
        DiaSemana janeiro = DiaSemana.JANEIRO;
        DiaSemana março = DiaSemana.MARÇO;
        DiaSemana maio = DiaSemana.MAIO;
        DiaSemana setembro = DiaSemana.SETEMBRO;
        DiaSemana novembro = DiaSemana.NOVEMBRO;
//Teste utilizando enum no Java
        System.out.println("Meses impares do ano.");
        imprimiDiaSemana(janeiro);
        imprimiDiaSemana(março);
        imprimiDiaSemana(maio);
        imprimiDiaSemana(setembro);
        imprimiDiaSemana(novembro);



    }

    private static void imprimiDiaSemana(DiaSemana dia) {
        switch (dia) {
            case JANEIRO:
                System.out.println("Janeiro");
                break;
            case MARÇO:
                System.out.println("Março");
                break;
            case MAIO:
                System.out.println("Maio");
                break;
            case JULHO:
                System.out.println("Julho");
                break;
            case SETEMBRO:
                System.out.println("Setembro");
                break;
            case NOVEMBRO:
                System.out.println("Novembro");
                break;

        }

    }
}