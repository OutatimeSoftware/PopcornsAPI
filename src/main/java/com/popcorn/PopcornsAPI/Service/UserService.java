package com.popcorn.PopcornsAPI.Service;

import com.popcorn.PopcornsAPI.Repository.CRUD;
import com.popcorn.PopcornsAPI.Repository.MovieRepository;
import com.popcorn.PopcornsAPI.Repository.UserRepository;
import com.popcorn.PopcornsAPI.entities.Movie;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public void saveItem(User user){
        userRepository.save(user);
    }

    public void updateItem(User user, Long id){
        User existingUser = userRepository.findById(id).orElse(null);
        existingUser.setEmail(user.getEmail());
        existingUser.setLastname(user.getLastname());
        existingUser.setName(user.getName());
        existingUser.setProfilePicture(user.getProfilePicture());
        existingUser.setUsername(user.getUsername());
        userRepository.save(existingUser);
    }

    public void deleteItem(Long id){
        userRepository.deleteById(id);
    }

    public List<User> listItems(){
        return userRepository.findAll();
    }

    public User getItem(Long id){
        return userRepository.findById(id).orElse(null);
    }

}
