package com.selection.arcmovie.services.rest;

import com.selection.arcmovie.entities.TmdbResponse;

public interface UpcomingMovieRestService {

    TmdbResponse getFirstPage();

    TmdbResponse getPage(Long page);

}
