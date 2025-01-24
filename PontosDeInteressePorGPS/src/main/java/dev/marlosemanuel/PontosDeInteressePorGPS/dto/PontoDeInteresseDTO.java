package dev.marlosemanuel.PontosDeInteressePorGPS.dto;

import dev.marlosemanuel.PontosDeInteressePorGPS.models.PontoDeInteresse;

public class PontoDeInteresseDTO {

    private String nome;
    private int cordenadaX;
    private int cordenadaY;

    public PontoDeInteresse toPontoDeInteresse() {
        return new PontoDeInteresse(this.nome, this.cordenadaX, this.cordenadaY);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }
}
