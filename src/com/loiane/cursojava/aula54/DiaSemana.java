package com.loiane.cursojava.aula54;

public enum DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7); // constante sempre com letra maiuscula.

    private int valor; //atributo

    //construtor
    DiaSemana(int valor){
        this.valor = valor;
    }
    //metodo
    public int getValor(){
        return this.valor;
    }
}
