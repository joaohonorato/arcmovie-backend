package com.selection.arcmovie.entities.dtos;

import java.io.Serializable;
import java.util.List;

public class UpcomingMovieDTO implements Serializable {

    private Long id;
    private String name;
    private String image;
    private List<GenreDTO> genre;
    private String overview;
    private String releaseDate;

    public UpcomingMovieDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<GenreDTO> getGenre() {
        return genre;
    }

    public void setGenre(List<GenreDTO> genre) {
        this.genre = genre;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "UpcomingMoviesDTO{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", genre='" + genre + '\'' +
                ", overview='" + overview + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

}
