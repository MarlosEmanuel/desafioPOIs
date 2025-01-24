package dev.marlosemanuel.PontosDeInteressePorGPS.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PontoDeInteresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cordenadaX;
    private int cordenadaY;
    public PontoDeInteresse() {}

    public PontoDeInteresse(String nome, int cordenadaX, int cordenadaY) {
        this.nome = nome;
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
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
