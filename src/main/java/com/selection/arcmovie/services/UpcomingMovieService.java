package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;

import java.util.List;

public interface UpcomingMovieService {
    List<UpcomingMovieDTO> all();

    List<UpcomingMovie> findByName();
}
