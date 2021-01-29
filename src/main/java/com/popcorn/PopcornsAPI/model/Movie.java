package com.popcorn.PopcornsAPI.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "movies")
@Table(name = "movies")
public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "title",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String movieTitle;
    @Column(
            name = "release_year",
            nullable = false
    )
    private Integer releaseYear;
    @Column(
            name = "add_by",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String addBy;
    @Column(
            name = "createdAt",
            nullable = false
    )
    private Timestamp createdAt;
    @Column(
            name = "updatedAt",
            nullable = false
    )
    private Timestamp updatedAt;

    public Movie(String movieTitle, Integer releaseYear, String addBy, Timestamp createdAt, Timestamp updatedAt) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.addBy = addBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MovieRatings{" +
                "movieTitle='" + movieTitle + '\'' +
                ", releaseYear=" + releaseYear +
                ", addBy='" + addBy + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}