package com.selection.arcmovie.entities.factory;

import com.selection.arcmovie.entities.UpcomingMovie;
import com.selection.arcmovie.entities.dtos.UpcomingMovieDTO;
import com.selection.arcmovie.entities.factory.common.BaseEntityFactory;
import com.selection.arcmovie.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpcomingMovieFactory extends BaseEntityFactory<UpcomingMovie, UpcomingMovieDTO> {

    @Autowired
    private  GenreService genreService;

    @Override
    public UpcomingMovieDTO getDTO(UpcomingMovie entity) {
        UpcomingMovieDTO dto = new UpcomingMovieDTO();
        dto.setId(entity.getId());
        String name = entity.getTitle() == null ? entity.getOriginalTitle() : entity.getTitle();
        name = name.equals(null) ? "undefined" : name;
        dto.setName(name);
        String image = entity.getPosterPath() == null ? entity.getBackdropPath() : entity.getPosterPath();
        image = image == null ? "undefined" : image;
        dto.setImage(image);
        dto.setGenre(genreService.mapIdToLabel(entity.getGenresId()));
        dto.setOverview(entity.getOverview());
        dto.setReleaseDate(entity.getReleaseDate().toString());

        return dto;
    }

    @Override
    public UpcomingMovie getEntity(UpcomingMovieDTO dto) {
        return null;
    }

}
