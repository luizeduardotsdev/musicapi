package dev.io.luizeduardotsdev.musicapi.service;

import dev.io.luizeduardotsdev.musicapi.genero.GeneroMusical;
import dev.io.luizeduardotsdev.musicapi.repository.GeneroMusicalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroMusicalService {

    private final GeneroMusicalRepository generoMusicalRepository;

    public GeneroMusicalService(GeneroMusicalRepository generoMusicalRepository) {
        this.generoMusicalRepository = generoMusicalRepository;
    }

    public void criar(GeneroMusical genero){
        generoMusicalRepository.save(genero);
    }

    public List<GeneroMusical> listar(){
        return generoMusicalRepository.findAll();
    }

    public Optional<GeneroMusical> listarPorId(Long id){
        return generoMusicalRepository.findById(id);
    }

    public void deletar(Long id){
        generoMusicalRepository.deleteById(id);
    }
}
