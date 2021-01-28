package com.popcorn.PopcornsAPI.Controllers;

import com.popcorn.PopcornsAPI.Entities.Movie;
import com.popcorn.PopcornsAPI.Entities.User;
import com.popcorn.PopcornsAPI.generic.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    @GetMapping("/movies")
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
                        12,
                        5,
                        2020
                ),
                new Date(
                        15,
                        5,
                        2020
                )
        ));

        // Return list
        return list;
    }

    @PostMapping("/movies")
    public Movie postMovie(
            @RequestBody Movie newMovie
    ) {
        // Save the Object to the DB

        // Return the created Object
        return newMovie;
    }
}
