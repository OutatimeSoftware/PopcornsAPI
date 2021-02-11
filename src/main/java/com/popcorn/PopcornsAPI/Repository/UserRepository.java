package com.popcorn.PopcornsAPI.Repository;

import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
