package com.popcorn.PopcornsAPI.Repository;

import com.popcorn.PopcornsAPI.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String> {
}
