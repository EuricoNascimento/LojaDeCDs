package model;

import java.io.Serializable;

public class CD implements Serializable {
    private String nomeAlbum;
    private String banda;
    private String genero;
    private double preco;

    public CD(String nomeAlbum, String banda, String genero, double preco) {
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nomeAlbum='" + nomeAlbum + '\'' +
                ", banda='" + banda + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco;
    }
}
