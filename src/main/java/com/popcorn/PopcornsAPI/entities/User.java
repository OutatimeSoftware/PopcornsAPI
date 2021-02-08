package com.popcorn.PopcornsAPI.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "popcorn_users")
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_unique_email", columnNames = "email")
        }
)
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "username",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String username;
    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "lastname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastname;
    @Column(
            name = "profilePicture",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String profilePicture;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;
    @OneToMany(mappedBy="addedBy")
    private List<Movie> movies;

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
