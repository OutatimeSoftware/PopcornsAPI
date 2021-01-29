package com.popcorn.PopcornsAPI.controllers;

import com.popcorn.PopcornsAPI.database.UserDAO;
import com.popcorn.PopcornsAPI.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    private UserDAO userDAO;

    @GetMapping("/api/users")
    public ArrayList<User> getAll() {
        // Create the users list
        ArrayList<User> list = new ArrayList<User>();

        // Fetch data from the DB
        list.add(new User(
                "MarioCZ",
                "Mario",
                "Chan",
                "https://avatars.githubusercontent.com/u/56327994?s=460&v=4",
                "mario@chan.im"
        ));

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

        // Return deleted Object
        return thisUser;
    }

}
