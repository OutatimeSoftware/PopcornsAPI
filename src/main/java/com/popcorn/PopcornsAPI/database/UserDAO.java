package com.popcorn.PopcornsAPI.database;

import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
}
