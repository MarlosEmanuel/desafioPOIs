package dev.marlosemanuel.PontosDeInteressePorGPS.services;

import dev.marlosemanuel.PontosDeInteressePorGPS.dto.PontoDeInteresseDTO;
import dev.marlosemanuel.PontosDeInteressePorGPS.models.PontoDeInteresse;
import dev.marlosemanuel.PontosDeInteressePorGPS.repository.PontodeInteresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PontoDeInteresseService {

    private final static int dMax = 10;

    @Autowired
    private PontodeInteresseRepository pontodeInteresseRepository;

    public void createPontoDeInteresse(PontoDeInteresse pontoDeInteresse) {
        pontodeInteresseRepository.save(pontoDeInteresse);
    }

    public List<PontoDeInteresse> findAll() {
        return pontodeInteresseRepository.findAll();
    }

    public double calcularDistancia(int cordenadaX, int cordenadaY,PontoDeInteresse pontoDeInteresse) {
        return Math.sqrt(Math.pow(pontoDeInteresse.getCordenadaX() - cordenadaX, 2) +
                Math.pow(pontoDeInteresse.getCordenadaY() - cordenadaY, 2));
    }

    public List<PontoDeInteresse> findPorProximidade(int cordenadaX, int cordenadaY) {
        List<PontoDeInteresse> listaDeProximidade = new ArrayList<>();
        for (PontoDeInteresse pontoDeInteresse : findAll()) {
            double distancia = calcularDistancia(cordenadaX, cordenadaY, pontoDeInteresse);
            if(distancia <= dMax) {
                listaDeProximidade.add(pontoDeInteresse);
            }
        }
        return listaDeProximidade;
    }

}
