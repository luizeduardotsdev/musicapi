package dev.io.luizeduardotsdev.musicapi.genero;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "genero_musical")
@Data
public class GeneroMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 50)
    private String nome;
}
