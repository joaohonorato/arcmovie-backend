package com.selection.arcmovie.entities.factory;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.GenreDTO;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.entities.factory.common.BaseEntityFactory;
import com.selection.arcmovie.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UpcomingMovieFactory extends BaseEntityFactory<UpcomingMovie, UpcomingMovieDTO> {

    @Autowired
    private GenreFactory genreFactory;


    @Override
    public UpcomingMovieDTO getDTO(UpcomingMovie entity) {
        UpcomingMovieDTO dto = new UpcomingMovieDTO();
        dto.setId(entity.getId());
        String name = entity.getTitle().equals(null) ? entity.getOriginalTitle() : entity.getTitle();
        name = name.equals(null) ? "undefined" : name;
        dto.setName(name);
        String image = entity.getPosterPath().equals(null) ? entity.getBackdropPath() : entity.getPosterPath();
        image = image.equals(null) ? "undefined" : image;
        dto.setImage(image);
        dto.setGenre(genreFactory.getDTOs(entity.getGenresId()));
        dto.setOverview(entity.getOverview());
        dto.setReleaseDate(entity.getReleaseDate().toString());

        return dto;
    }

    @Override
    public UpcomingMovie getEntity(UpcomingMovieDTO dto) {
        return null;
    }
}
