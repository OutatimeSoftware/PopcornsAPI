package com.popcorn.PopcornsAPI.Entities;

public class User {

    private String username;
    private String name;
    private String lastname;
    private String profilePicture;
    private String email;

    public User(String username, String name, String lastname, String profilePicture, String email) {
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.profilePicture = profilePicture;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
