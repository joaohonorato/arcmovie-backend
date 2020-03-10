package com.selection.arcmovie.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TmdbResponse {

    @JsonProperty("results")
    public List<UpcomingMovie> upcomingMovies;
    public Long page;
    @JsonProperty("total_results")
    public Long totalResults;
    public TmdbPeriod dates;
    @JsonProperty("total_pages")
    public Long totalPages;
    public List<Genre> genres;

    public TmdbResponse() {
    }

    public List<UpcomingMovie> getUpcomingMovies() {
        return upcomingMovies;
    }

    public void setUpcomingMovies(List<UpcomingMovie> upcomingMovies) {
        this.upcomingMovies = upcomingMovies;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public TmdbPeriod getDates() {
        return dates;
    }

    public void setDates(TmdbPeriod dates) {
        this.dates = dates;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


    @Override
    public String toString() {
        return "TmdbResponse{" +
                "results=" + upcomingMovies +
                ", page=" + page +
                ", totalResults=" + totalResults +
                ", dates=" + dates +
                ", totalPages=" + totalPages +
                ", genres=" + genres +
                '}';
    }
}
