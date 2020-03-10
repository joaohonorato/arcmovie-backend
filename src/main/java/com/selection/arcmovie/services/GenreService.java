package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.GenreDTO;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;

import java.util.List;

public interface GenreService {

    List<GenreDTO> mapIdToGenreDTO(List<Long> genresId);

}
