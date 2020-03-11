package com.selection.arcmovie.repository;

import com.selection.arcmovie.entities.TmdbResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpcomingMovieRepository extends CrudRepository<TmdbResponse, String> {
}