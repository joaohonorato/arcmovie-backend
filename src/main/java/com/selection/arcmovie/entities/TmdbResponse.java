package com.selection.arcmovie.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TmdbResponse {

    public List<Movie> results;
    public Long page;
    @JsonProperty("total_results")
    public Long totalResults;
    public TmdbPeriod dates;
    @JsonProperty("total_pages")
    public Long totalPages;
    public List<Genre> genres;

}