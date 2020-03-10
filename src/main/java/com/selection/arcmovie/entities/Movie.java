package com.selection.arcmovie.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Movie implements Serializable {

    private Double popularity;
    @JsonProperty("vote_count")
    private Long voteCount;
    private Boolean video;
    @JsonProperty("poster_path")
    private URI posterPath;
    private Long id;
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private URI backdropPath;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("genres_id")
    private List<Genre> genresId;
    private String title;
    @JsonProperty("vote_average")
    private Long voteAverage;
    @JsonProperty("release_date")
    private String overview;
    private LocalDate releaseDate;

    public Movie(String title) {
        this.title = title;
    }

}
