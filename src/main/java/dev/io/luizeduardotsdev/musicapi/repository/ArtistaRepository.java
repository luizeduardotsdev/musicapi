package dev.io.luizeduardotsdev.musicapi.repository;

import dev.io.luizeduardotsdev.musicapi.domain.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
