package dev.marlosemanuel.PontosDeInteressePorGPS.controllers;

import dev.marlosemanuel.PontosDeInteressePorGPS.dto.PontoDeInteresseDTO;
import dev.marlosemanuel.PontosDeInteressePorGPS.models.PontoDeInteresse;
import dev.marlosemanuel.PontosDeInteressePorGPS.services.PontoDeInteresseService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/POIs")
public class PontoDeInteresseController {


    @Autowired
    private PontoDeInteresseService pontoDeInteresseService;

    @Operation(summary = "Lista todos os pontos de interesse", method = "GET")
    @GetMapping
    public List<PontoDeInteresse> getAllPontoDeInteresse(){
        return pontoDeInteresseService.findAll();
    }

    @Operation(summary = "Registra um ponto de interesse", method = "POST")
    @PostMapping
    public void save(@RequestBody PontoDeInteresseDTO pontoDeInteresse){
        pontoDeInteresseService.createPontoDeInteresse(pontoDeInteresse.toPontoDeInteresse());
    }

    @Operation(summary = "Lista os pontos pela sua proximidade", method = "GET")
    @GetMapping("/listarPOIsPorProximidade")
    public List<PontoDeInteresse> listarPOIsPorProximidade(
            @RequestParam int cordenadaX,
            @RequestParam int cordenadaY
    ){
        return pontoDeInteresseService.findPorProximidade(cordenadaY,cordenadaX);
    }
}
