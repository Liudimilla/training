package com.loiane.cursojava.aula56;

public enum Tipodocumento {

    CPF {
       @Override
        public String geraNumeroTeste(){
           return GeraCpfCnpj.cpf();
       }

    },
    CNPJ {
        @Override
        public String geraNumeroTeste(){
            return GeraCpfCnpj.cnpj();
        }


    };

    public abstract String geraNumeroTeste();


}

