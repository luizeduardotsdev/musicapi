package dev.io.luizeduardotsdev.musicapi.genero;

import jakarta.persistence.*;

@Entity
@Table(name = "genero_musical")
public class GeneroMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
}
