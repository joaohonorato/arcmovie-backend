package com.selection.arcmovie.controllers;

import com.selection.arcmovie.entities.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/")
    public ResponseEntity<List<Movie>> all(){
        return ResponseEntity.ok().body(Arrays.asList(new Movie("All movies")));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Movie>> findByName() {
        return ResponseEntity.ok().body(Arrays.asList(new Movie("The movies")));
    }
}
