package dev.marlosemanuel.PontosDeInteressePorGPS.repository;

import dev.marlosemanuel.PontosDeInteressePorGPS.models.PontoDeInteresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontodeInteresseRepository extends JpaRepository<PontoDeInteresse,Long> {
}
