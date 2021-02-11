package com.popcorn.PopcornsAPI.controllers;

import com.popcorn.PopcornsAPI.Service.MovieService;
import com.popcorn.PopcornsAPI.Service.UserService;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    UserService userService = new UserService();

    @GetMapping("/api/users")
    public List<User> getAll() {
        // Create the users list
        List<User> list = null;

        // Fetch data from the DB
        list = userService.listItems();

        // Return the list
        return list;
    }

    @PostMapping("/api/users")
    public User postUser(
            @RequestBody User newUser
    ) {
        // Create the Object
        User thisUser = new User(
                newUser.getUsername(),
                newUser.getName(),
                newUser.getLastname(),
                newUser.getProfilePicture(),
                newUser.getEmail()
        );

        // Save Object to the DB
        userService.saveItem(thisUser);

        // Return the created Object
        return thisUser;
    }

    @GetMapping("/api/users/{id}")
    public User getUser(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch user with thisID
        User thisUser = new User(
                "zezima",
                "Luis",
                "Castrejón",
                "https://ui-avatars.com/api/?name=John+Doe",
                "zezima@gmail.com"
        );
        thisUser = userService.getItem(thisID);

        // Return fetched Object
        return thisUser;
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(
            @PathVariable(value="id") int thisID,
            @RequestBody User newUser
    ) {
        // Fetch user with thisID
        User thisUser = new User(
                "Artix",
                "Rodrigo",
                "Pantoja",
                "https://ui-avatars.com/api/?name=John+Doe",
                "pantoja@gmail.com"
        );

        // Update user with the new data
        thisUser.setUsername(newUser.getUsername());
        thisUser.setName(newUser.getName());
        thisUser.setLastname(newUser.getLastname());
        thisUser.setProfilePicture(newUser.getProfilePicture());
        thisUser.setEmail(newUser.getEmail());

        userService.updateItem(thisUser, thisID);

        // Return updated user
        return thisUser;
    }

    @DeleteMapping("/api/users/{id}")
    public User deleteUser(
            @PathVariable(value="id") int thisID
    ) {
        // Fetch the Object with thisID
        User thisUser = new User(
                "CharliePs",
                "Charles",
                "Darwin",
                "https://ui-avatars.com/api/?name=John+Doe",
                "charles@gmail.com"
        );

        // Delete the Object with thisID
        userService.deleteItem(thisID);

        // Return deleted Object
        return thisUser;
    }

}
