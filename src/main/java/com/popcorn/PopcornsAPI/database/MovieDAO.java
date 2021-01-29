package com.popcorn.PopcornsAPI.database;

import com.popcorn.PopcornsAPI.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDAO extends JpaRepository<Movie, Integer> {
}
