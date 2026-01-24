package dev.io.luizeduardotsdev.musicapi.controller;

import dev.io.luizeduardotsdev.musicapi.genero.GeneroMusical;
import dev.io.luizeduardotsdev.musicapi.service.GeneroMusicalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<GeneroMusical> listar(){
        return service.listar();
    }
}
