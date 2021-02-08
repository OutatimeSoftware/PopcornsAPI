package com.popcorn.PopcornsAPI.Repository;

import com.popcorn.PopcornsAPI.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
