package com.popcorn.PopcornsAPI.Controllers;

import com.popcorn.PopcornsAPI.Entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @GetMapping("/users")
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

    @PostMapping("/users")
    public User postUser(
            @RequestBody User newUser
    ) {
        // Save Object to the DB

        // Return the created Object
        return newUser;
    }

}
