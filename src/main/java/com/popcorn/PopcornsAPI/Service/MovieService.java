package com.popcorn.PopcornsAPI.Service;

import com.popcorn.PopcornsAPI.Repository.MovieRepository;
import com.popcorn.PopcornsAPI.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void saveItem(Movie movie){
        movieRepository.save(movie);
    }

    public void updateItem(Movie movie, Integer id){
        Movie existingMovie = movieRepository.findById(id).orElse(null);
        existingMovie.setAddedBy(movie.getAddedBy());
        existingMovie.setCreatedAt(movie.getCreatedAt());
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setUpdatedAt(movie.getUpdatedAt());
        movieRepository.save(existingMovie);
    }

    public void deleteItem(Integer id){
        movieRepository.deleteById(id);
    }

    public List<Movie> listItems(){
        return movieRepository.findAll();
    }

    public Movie getItem(Integer id){
        return movieRepository.findById(id).orElse(null);
    }

}
