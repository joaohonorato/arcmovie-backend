package com.selection.arcmovie.controllers;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.entities.factory.UpcomingMovieFactory;
import com.selection.arcmovie.services.GenreService;
import com.selection.arcmovie.services.UpcomingMovieService;
import com.selection.arcmovie.services.UpcomingMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private UpcomingMovieService upcomingMovieService;

    @GetMapping("/")
    public ResponseEntity<List<UpcomingMovieDTO>> all(){
        return ResponseEntity.ok().body(upcomingMovieService.all());
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<UpcomingMovie>> findByName() {
        return ResponseEntity.ok().body(Arrays.asList(new UpcomingMovie("The movies")));
    }
}
