package dev.io.luizeduardotsdev.musicapi.service;

import dev.io.luizeduardotsdev.musicapi.repository.GeneroMusicalRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneroMusicalService {

    private final GeneroMusicalRepository generoMusicalRepository;

    public GeneroMusicalService(GeneroMusicalRepository generoMusicalRepository) {
        this.generoMusicalRepository = generoMusicalRepository;
    }
}
