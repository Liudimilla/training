package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula53.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args){
        System.out.println(Enum.valueOf(DiaSemana.class, "JANEIRO"));
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "NOVEMBRO");// instaciado

        System.out.println(dia);
    }
}