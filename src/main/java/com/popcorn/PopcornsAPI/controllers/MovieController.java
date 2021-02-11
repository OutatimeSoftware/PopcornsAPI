package com.popcorn.PopcornsAPI.controllers;

import com.popcorn.PopcornsAPI.Service.MovieService;
import com.popcorn.PopcornsAPI.entities.Movie;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MovieController {

    MovieService movieService = new MovieService();

    @GetMapping("/api/movies")
    public List<Movie> getAll() {
        // Create Movie list
        List<Movie> list = new ArrayList<Movie>();

        // Fetch data from DB
        list = movieService.listItems();

        // Return list
        return list;

    }

    @PostMapping("/api/movies")
    public Movie postMovie(
            @RequestBody Movie newMovie
    ) {
        // Create the Object
        Movie thisMovie = new Movie(
                newMovie.getID(),
                newMovie.getTitle(),
                newMovie.getAddedBy(),
                newMovie.getCreatedAt(),
                newMovie.getUpdatedAt()
        );

        // Save the Object to the DB
        movieService.saveItem(thisMovie);

        // Return the created Object
        return thisMovie;
    }

    @GetMapping("/api/movies/{id}")
    public Movie getMovie(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch the movie with the thisID
        Movie thisMovie = new Movie(
                2,
                "Parasite",
                new User(
                        "MigueRA",
                        "Miguel",
                        "Ávila",
                        "https://avatars.githubusercontent.com/u/35583825?s=460&u=74d04bff33c79dc8d3032df0337020cccfbfd218&v=4",
                        "miguel@avila.cool"
                ),
                new Date(
                        2023,
                        1,
                        21
                ),
                new Date(2203,
                        1,
                        20)
        );
        thisMovie = movieService.getItem(thisID);

        // Return movie
        return thisMovie;
    }

    @PutMapping("/api/movies/{id}")
    public Movie updateMovie(
            @PathVariable(value="id") int thisID,
            @RequestBody Movie newMovie
    ) {
        // Fetch the movie with the thisID
        Movie thisMovie = new Movie(
                3,
                "X-Men",
                new User(
                        "Apoquinto",
                        "Roberto",
                        "Llanes",
                        "https://ui-avatars.com/api/?name=John+Doe",
                        "roberto@cllanes.com"
                ),
                new Date(
                        219,
                        12,
                        20
                ),
                new Date(
                        21,
                        11,
                        20
                )
        );

        // Update the movie Object
        thisMovie.setTitle(newMovie.getTitle());
        thisMovie.setAddedBy(newMovie.getAddedBy());
        thisMovie.setCreatedAt(newMovie.getCreatedAt());
        thisMovie.setUpdatedAt(newMovie.getUpdatedAt());

        movieService.updateItem(thisMovie, thisID);

        // Return updated Object
        return thisMovie;

    }

    @DeleteMapping("/api/movies/{id}")
    public Movie deleteMovie(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch movie with thisID
        Movie thisMovie = new Movie(
                5,
                "Harry Potter",
                new User(
                        "doej",
                        "John",
                        "Doe",
                        "https://ui-avatars.com/api/?name=John+Doe",
                        "john@doe.com"
                ),
                new Date(
                        6,
                        4,
                        2020
                ),
                new Date(
                        8,
                        11,
                        2021
                )
        );

        // Delete movie with thisID
        movieService.deleteItem(thisID);

        // Return deleted movie
        return thisMovie;
    }
}
