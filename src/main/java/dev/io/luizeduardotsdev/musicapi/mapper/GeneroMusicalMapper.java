package dev.io.luizeduardotsdev.musicapi.mapper;

import dev.io.luizeduardotsdev.musicapi.controller.dto.request.GeneroMusicalRequest;
import dev.io.luizeduardotsdev.musicapi.controller.dto.response.GeneroMusicalResponse;
import dev.io.luizeduardotsdev.musicapi.domain.GeneroMusical;
import org.springframework.stereotype.Component;

@Component
public class GeneroMusicalMapper {

    public GeneroMusical toEntity(GeneroMusicalRequest request){
        GeneroMusical generoMusical = new GeneroMusical();
        generoMusical.setNome(request.nome());
        return generoMusical;
    }

    public GeneroMusicalResponse toResponse(GeneroMusical generoMusical){
        return new GeneroMusicalResponse(generoMusical.getId(), generoMusical.getNome());
    }
}
