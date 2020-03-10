package com.selection.arcmovie.entities.factory;

import com.selection.arcmovie.entities.Genre;
import com.selection.arcmovie.entities.dtos.GenreDTO;
import com.selection.arcmovie.entities.factory.common.BaseEntityFactory;
import com.selection.arcmovie.services.GenreService;
import com.selection.arcmovie.services.rest.GenreRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenreFactory extends BaseEntityFactory<Long, GenreDTO> {


    @Autowired
    private GenreRestService genreRestService;

    @Override
    public GenreDTO getDTO(Long id) {
        GenreDTO dto = new GenreDTO();
        dto.setId(id);
        return dto;
    }

    @Override
    public Long getEntity(GenreDTO dto) {
        return null;
    }
}
