package dev.io.luizeduardotsdev.musicapi.controller;

import dev.io.luizeduardotsdev.musicapi.service.GeneroMusicalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroMusicalController {

    private final GeneroMusicalService service;

    public GeneroMusicalController(GeneroMusicalService service) {
        this.service = service;
    }
}
