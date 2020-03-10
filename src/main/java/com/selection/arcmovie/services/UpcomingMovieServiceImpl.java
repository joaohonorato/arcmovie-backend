package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.entities.factory.UpcomingMovieFactory;
import com.selection.arcmovie.services.rest.UpcomingMovieRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpcomingMovieServiceImpl implements UpcomingMovieService {

    @Value("${app.api.key}")
    private String apiKey;

    @Autowired
    private UpcomingMovieRestService upcomingMovieRestService;

    @Autowired
    private UpcomingMovieFactory upcomingMovieFactory;

    @Autowired
    private GenreService genreService;

    @Override
    public List<UpcomingMovieDTO> all() {
        List<UpcomingMovie> upcomingMovies = upcomingMovieRestService.all().getUpcomingMovies();
        List<UpcomingMovieDTO> upcomingMovieDTOS = upcomingMovieFactory.getDTOs(upcomingMovies);
        return upcomingMovieDTOS;
    };
    @Override
    public List<UpcomingMovie> findByName() {
        return null;
    }

}
