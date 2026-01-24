package dev.io.luizeduardotsdev.musicapi.controller;

import dev.io.luizeduardotsdev.musicapi.genero.GeneroMusical;
import dev.io.luizeduardotsdev.musicapi.service.GeneroMusicalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroMusicalController {

    private final GeneroMusicalService service;

    public GeneroMusicalController(GeneroMusicalService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody GeneroMusical generoMusical){
        service.criar(generoMusical);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
