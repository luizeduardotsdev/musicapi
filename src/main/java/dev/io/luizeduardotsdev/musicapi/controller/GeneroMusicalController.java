package dev.io.luizeduardotsdev.musicapi.controller;

import dev.io.luizeduardotsdev.musicapi.controller.dto.request.GeneroMusicalRequest;
import dev.io.luizeduardotsdev.musicapi.controller.dto.response.GeneroMusicalResponse;
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
    public ResponseEntity<Void> criar(@RequestBody GeneroMusicalRequest request){
        service.criar(mapper.toEntity(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<GeneroMusicalResponse>> listar(){
        List<GeneroMusical> listar = service.listar();
        return ResponseEntity.ok().body(listar.stream()
                .map(mapper::toResponse).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<GeneroMusicalResponse>> listarPorId(@PathVariable Long id){
        Optional<GeneroMusical> generoOptional = service.listarPorId(id);
         return ResponseEntity.ok().body(generoOptional.map(mapper::toResponse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
