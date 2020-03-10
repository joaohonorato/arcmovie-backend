package com.selection.arcmovie.controllers;

import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping("/")
    public ResponseEntity<TmdbResponse> all(){
        return ResponseEntity.ok().body(genreService.all());
    }

}
