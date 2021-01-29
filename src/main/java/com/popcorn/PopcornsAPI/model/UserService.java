package com.popcorn.PopcornsAPI.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public User getUserById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public String DeleteUser(Long id){
        repository.deleteById(id);
        return "Usuario con id" + id + "eliminado con exito :D";
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        return repository.save(existingUser);
    }

}
