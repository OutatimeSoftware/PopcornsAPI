package com.popcorn.PopcornsAPI.entities;

//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

//@Document(collation = "ratings")
public class Rating {

    //@Id
    private final Integer ID;
    private String movieTitle;
    private Integer rating;
    private String review;

    public Rating(Integer ID, String movieTitle, Integer rating, String review) {
        this.ID = ID;
        this.movieTitle = movieTitle;
        this.rating = rating;
        this.review = review;
    }

    public Integer getID() {
        return ID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
