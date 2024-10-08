package com.haroun.movies.service;


import com.haroun.movies.model.Movie;
import com.haroun.movies.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
