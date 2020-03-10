package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.TmdbResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public TmdbResponse all() {
        TmdbResponse result = restTemplate.getForObject(
                "https://api.themoviedb.org/3/genre/movie/list?api_key=1f54bd990f1cdfb230adb312546d765d&language=en-US", TmdbResponse.class);

        return result;
    }
}
