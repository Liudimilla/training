package com.loiane.cursojava.aula56;
//Exercícios Enum (Calculadora com Enum)
public class Calculadora {
//a. Enum que representa as quatro operaçoes matematica;
    enum Operacao{

        SOMA("+"){
           @Override
           public double executarOperacao(double x, double y) {
               return x + y;
           }
        }, SUBTRAIR("-"){
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*"){
                @Override
                public double executarOperacao(double x, double y) {
                    return x * y;
                }
        }, DIVIDIR("/"){
                    @Override
                    public double executarOperacao(double x, double y) {
                        return x / y;
                    }
        };

        private String simbolo;
         //b.construtor que recebe os simbolos
        Operacao(String simbolo){
            this.simbolo = simbolo;
        }
        //d.Implementa o metodo abstrato, cada opçao do enum de implementa o metodo realizado na oepraçao de acordo a descriçao.
        public abstract double executarOperacao(double x, double y);
        //c.Sobrescreve o metodo que retorna somente o simbolo da operaçao
        public String toString(){
            return this.simbolo;
        }
    }
    //e.metodo main p/testar as operaçoes do enum.
    public static void main(String[] args){

        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() +" ");
            System.out.print(y + " ");
            System.out.println(op.executarOperacao(x,y));
        }

    }
}
