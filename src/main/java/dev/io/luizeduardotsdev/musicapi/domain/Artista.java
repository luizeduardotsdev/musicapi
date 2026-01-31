package dev.io.luizeduardotsdev.musicapi.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "artista")
@Data
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "nome_artistico", nullable = false, length = 50)
    private String nomeArtistico;
}
