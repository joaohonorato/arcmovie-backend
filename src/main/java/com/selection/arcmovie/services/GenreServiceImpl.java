package com.selection.arcmovie.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.TmdbResponse;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.GenreDTO;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.services.rest.GenreRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRestService genreRestService;

    @Override
    public List<GenreDTO> mapIdToGenreDTO(List<Long> genresId) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<GenreDTO> genreDTOS = new ArrayList<>();
        List<Genre> genres = genreRestService.all();
        Map<Long,String> genresMap = (Map<Long, String>) objectMapper.convertValue(genres,Genre.class);
        for (Long id: genresId){
            genreDTOS.add(new GenreDTO(id, genresMap.get(id)));
        }

        return genreDTOS;
    }
}
