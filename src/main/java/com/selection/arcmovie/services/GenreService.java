package com.selection.arcmovie.services;

import com.selection.arcmovie.entities.dtos.GenreDTO;

import java.util.List;

public interface GenreService {

    List<GenreDTO> mapIdToLabel(List<Long> genresId);

}
