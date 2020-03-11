package com.selection.arcmovie.controllers;

import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.repository.TmdbResponseRepository;
import com.selection.arcmovie.services.GenreServiceImpl;
import com.selection.arcmovie.services.UpcomingMovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/movies/")
public class MovieController {

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private UpcomingMovieService upcomingMovieService;

    @Autowired
    private GenreServiceImpl genreService;

    @GetMapping("/")
    public ResponseEntity<List<UpcomingMovieDTO>> all(){
        return ResponseEntity.ok().body(upcomingMovieService.all());
    }

    @GetMapping("/page/{page}")
    public ResponseEntity<List<UpcomingMovieDTO>> getPage(@PathVariable(value = "page") Long page){
        return ResponseEntity.ok().body(upcomingMovieService.getPage(page));
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<Map<Long,String>> findByName() {
        return ResponseEntity.ok().body(null);
    }

}
