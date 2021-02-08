package com.popcorn.PopcornsAPI.Service;

import com.popcorn.PopcornsAPI.Repository.CRUD;
import com.popcorn.PopcornsAPI.Repository.MovieRepository;
import com.popcorn.PopcornsAPI.Repository.UserRepository;
import com.popcorn.PopcornsAPI.entities.Movie;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements CRUD<User> {

    @Autowired
    private UserRepository userRepository;

    public void saveItem(User user){
        userRepository.save(user);
    }

    public void updateItem(User user, Integer id){
        User existingUser = userRepository.findById(id).orElse(null);
        existingUser.setEmail(user.getEmail());
        existingUser.setLastname(user.getLastname());
        existingUser.setName(user.getName());
        existingUser.setProfilePicture(user.getProfilePicture());
        existingUser.setUsername(user.getUsername());
    }

    public void deleteItem(Integer id){
        userRepository.deleteById(id);
    }

    public List<User> listItems(){
        return userRepository.findAll();
    }

}
