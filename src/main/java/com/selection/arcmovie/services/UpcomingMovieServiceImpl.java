package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.entities.factory.UpcomingMovieFactory;
import com.selection.arcmovie.services.rest.UpcomingMovieRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpcomingMovieServiceImpl implements UpcomingMovieService {

    private static final Logger log = LoggerFactory.getLogger(UpcomingMovieServiceImpl.class);

    @Autowired
    private UpcomingMovieRestService upcomingMovieRestService;

    @Autowired
    private UpcomingMovieFactory upcomingMovieFactory;

    @Autowired
    private GenreService genreService;

    @Override
    public List<UpcomingMovieDTO> all() {
        TmdbResponse response = upcomingMovieRestService.getFirstPage();
        List<UpcomingMovie> upcomingMovies = response.getUpcomingMovies();
        List<UpcomingMovieDTO> upcomingMovieDTOS = upcomingMovieFactory.getDTOs(upcomingMovies);
        if(response.getTotalPages() > 1) {
            for (int i = 2; i <= response.getTotalPages(); i++) {
                upcomingMovieDTOS.addAll(
                        upcomingMovieFactory.getDTOs(upcomingMovieRestService.getPage(new Long(i)).getUpcomingMovies()));
            }
        }
        return upcomingMovieDTOS;
    }

    @Override
    public List<UpcomingMovieDTO> getPage(Long number) {
        return upcomingMovieFactory.getDTOs(upcomingMovieRestService.getPage(number).getUpcomingMovies());
    }

    ;
    @Override
    public List<UpcomingMovie> findByName() {
        return null;
    }

}
