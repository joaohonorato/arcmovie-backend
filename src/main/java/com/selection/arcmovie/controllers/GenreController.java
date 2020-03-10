package com.selection.arcmovie.controllers;

import com.selection.arcmovie.entities.Genre;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @GetMapping("/")
    public ResponseEntity<List<Genre>> all(){
        return ResponseEntity.ok().body(Arrays.asList(new Genre("All genres")));
    }

}
