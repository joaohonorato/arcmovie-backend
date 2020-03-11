package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.dtos.GenreDTO;
import com.selection.arcmovie.services.rest.GenreRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl implements GenreService {

    private static final Logger log = LoggerFactory.getLogger(GenreServiceImpl.class);

    @Autowired
    private GenreRestService genreRestService;

    @Override
    public List<GenreDTO> mapIdToLabel(List<Long> genresId) {
        List<GenreDTO> genreDTOS = new ArrayList<>();
        List<Genre> genres = genreRestService.all().getGenres();
        Map<Long,String> genresMap = genres.stream().collect(Collectors.toMap(Genre::getId,Genre::getName));
        for (Long id: genresId){
            genreDTOS.add(new GenreDTO(id, genresMap.get(id)));
        }
        return genreDTOS;
    }

}
