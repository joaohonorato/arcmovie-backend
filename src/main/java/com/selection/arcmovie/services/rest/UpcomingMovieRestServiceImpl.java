package com.selection.arcmovie.services.rest;

import com.selection.arcmovie.entities.TmdbResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UpcomingMovieRestServiceImpl implements UpcomingMovieRestService {

    private static final Logger log = LoggerFactory.getLogger(UpcomingMovieRestServiceImpl.class);

    @Value("${app.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public TmdbResponse getFirstPage() {
        StringBuilder sb = new StringBuilder("https://api.themoviedb.org/3/movie/upcoming?api_key=");
        sb.append(apiKey).append("&language=en-US&page=1");
        TmdbResponse result = restTemplate.getForObject(sb.toString() , TmdbResponse.class);

        return result;
    }

    @Override
    public TmdbResponse getPage(Long page) {
        StringBuilder sb = new StringBuilder("https://api.themoviedb.org/3/movie/upcoming?api_key=");
        sb.append(apiKey).append("&language=en-US");
        if(page != null) {
            sb.append("&page=").append(page);
        } else {
            sb.append("&page=1");
        }
        TmdbResponse result = restTemplate.getForObject(sb.toString() , TmdbResponse.class);
        return result;
    }

    ;

}
