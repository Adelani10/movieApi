package com.haroun.movies.controller;

import com.haroun.movies.model.Movie;
import com.haroun.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> allMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/movies/{imdbId}")
    public ResponseEntity<Optional<Movie>> movieById(@PathVariable String imdbId){
        return new ResponseEntity<>(movieService.getMovieById(imdbId), HttpStatus.OK) ;
    }
}
