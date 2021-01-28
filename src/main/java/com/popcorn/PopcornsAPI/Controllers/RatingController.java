package com.popcorn.PopcornsAPI.Controllers;

import com.popcorn.PopcornsAPI.Entities.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        // Save the Object to the DB


        // Return the created Object
        return newRating;
    }

}
