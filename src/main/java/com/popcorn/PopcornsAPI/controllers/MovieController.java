package com.popcorn.PopcornsAPI.controllers;

import com.popcorn.PopcornsAPI.entities.Movie;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class MovieController {

    @GetMapping("/api/movies")
    public ArrayList<Movie> getAll() {
        // Create Movie list
        ArrayList<Movie> list = new ArrayList<Movie>();

        // Fetch data from DB
        list.add(new Movie(
                1,
                "Soul",
                new User(
                        "imreyesjorge",
                        "Jorge",
                        "Reyes",
                        "https://avatars.githubusercontent.com/u/40706868?s=460&u=4b8f72baeca2602e7d948ec807e1321802bb1cef&v=4",
                        "jorge@reyes.im"
                ),
                new Date(
                        2020,
                        5,
                        10
                ),
                new Date(
                        2020,
                        5,
                        20
                )
        ));

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

        // Return deleted movie
        return thisMovie;
    }
}
