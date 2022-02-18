package com.loiane.cursojava.aula56;

public class Pessoa {
    private Tipodocumento tipodocumento;
    private String numeroDocumento;

    public Pessoa() {
        super();
    }

    public Pessoa(Tipodocumento tipodocumento, String numeroDocumento) {
        super();
        this.tipodocumento = tipodocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipodocumento=" + tipodocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }
}
