package com.popcorn.PopcornsAPI.Controllers;

import com.popcorn.PopcornsAPI.Entities.Rating;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RatingController {

    @GetMapping("/ratings")
    public ArrayList<Rating> getAll() {

        // Create rating list
        ArrayList<Rating> ratingList = new ArrayList<Rating>();

        // Fetch datat from DB
        ratingList.add(new Rating(
                1,
                "Soul",
                5,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum tempor turpis accumsan pretium. Donec id commodo metus, sit amet aliquam arcu. Cras placerat feugiat feugiat. Etiam euismod diam non purus pretium, ut lobortis massa pulvinar. Morbi aliquet vel elit vitae ullamcorper. Mauris quis orci a sem sollicitudin suscipit. Curabitur non magna hendrerit odio convallis dignissim id a metus. Curabitur felis purus, volutpat eu felis quis, malesuada interdum nunc. "
        ));

        // Return the list
        return ratingList;

    }

    @PostMapping("/ratings")
    public Rating postRating(
            @RequestBody Rating newRating
    ){
        // Create the rating Object
        Rating thisRating = new Rating(
                newRating.getID(),
                newRating.getMovieTitle(),
                newRating.getRating(),
                newRating.getReview()
        );

        // Save the Object to the DB


        // Return the created Object
        return thisRating;
    }

    @GetMapping("/ratings/{id}")
    public Rating getRating(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch rating Object with thisID
        Rating thisRating = new Rating(
                4,
                "Harry Potter",
                5,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum tempor turpis accumsan pretium. Donec id commodo metus, sit amet aliquam arcu. Cras placerat feugiat feugiat. Etiam euismod diam non purus pretium, ut lobortis massa pulvinar. Morbi aliquet vel elit vitae ullamcorper. Mauris quis orci a sem sollicitudin suscipit. Curabitur non magna hendrerit odio convallis dignissim id a metus. Curabitur felis purus, volutpat eu felis quis, malesuada interdum nunc."
        );

        // Return fetched Object
        return thisRating;
    }

    @PutMapping("/ratings/{id}")
    public Rating updateRating(
            @PathVariable(value="id") int thisID,
            @RequestBody Rating newRating
    ) {
        // Fetch rating Object with thisID
        Rating thisRating = new Rating(
                5,
                "Up",
                4,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum tempor turpis accumsan pretium. Donec id commodo metus, sit amet aliquam arcu. Cras placerat feugiat feugiat. Etiam euismod diam non purus pretium, ut lobortis massa pulvinar. Morbi aliquet vel elit vitae ullamcorper. Mauris quis orci a sem sollicitudin suscipit. Curabitur non magna hendrerit odio convallis dignissim id a metus. Curabitur felis purus, volutpat eu felis quis, malesuada interdum nunc."
        );

        // Update the fetched Object
        thisRating.setMovieTitle(newRating.getMovieTitle());
        thisRating.setRating(newRating.getRating());
        thisRating.setReview(newRating.getReview());

        // Return the updated Object
        return thisRating;
    }

    @DeleteMapping("/ratings/{id}")
    public Rating deleteRating(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch rating Object with thisID
        Rating thisRating = new Rating(
                6,
                "Star Wars",
                4,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum tempor turpis accumsan pretium. Donec id commodo metus, sit amet aliquam arcu. Cras placerat feugiat feugiat. Etiam euismod diam non purus pretium, ut lobortis massa pulvinar. Morbi aliquet vel elit vitae ullamcorper. Mauris quis orci a sem sollicitudin suscipit. Curabitur non magna hendrerit odio convallis dignissim id a metus. Curabitur felis purus, volutpat eu felis quis, malesuada interdum nunc."
        );

        // Delete the Object with thisID

        // Return deleted Object
        return thisRating;
    }

}
