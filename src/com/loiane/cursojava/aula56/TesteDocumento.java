package com.loiane.cursojava.aula56;

public class TesteDocumento {
    public static void main(String[] args) {
       /* for (Tipodocumento doc : Tipodocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        } */
        Pessoa pf = new Pessoa();
        pf.setTipodocumento(Enum.valueOf(Tipodocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipodocumento().geraNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipodocumento(Enum.valueOf(Tipodocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipodocumento().geraNumeroTeste());
        System.out.println(pj);
    }
}
