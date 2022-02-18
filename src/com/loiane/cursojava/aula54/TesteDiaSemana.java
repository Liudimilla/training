package com.loiane.cursojava.aula54;
/* Constantes no Java
Enumeradores como classe (construtor e métodos) */
public class TesteDiaSemana {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString()+ " - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }
}
