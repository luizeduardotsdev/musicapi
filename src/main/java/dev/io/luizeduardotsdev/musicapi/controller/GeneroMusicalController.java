package dev.io.luizeduardotsdev.musicapi.controller;

import dev.io.luizeduardotsdev.musicapi.controller.dto.GeneroMusicalRequest;
import dev.io.luizeduardotsdev.musicapi.domain.GeneroMusical;
import dev.io.luizeduardotsdev.musicapi.mapper.GeneroMusicalMapper;
import dev.io.luizeduardotsdev.musicapi.service.GeneroMusicalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/genero")
public class GeneroMusicalController {

    private final GeneroMusicalService service;
    private final GeneroMusicalMapper mapper;


    public GeneroMusicalController(GeneroMusicalService service, GeneroMusicalMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody GeneroMusicalRequest request){
        service.criar(mapper.toEntity(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<GeneroMusical> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<GeneroMusical> listarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        service.deletar(id);
    }
}
