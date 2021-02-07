package com.popcorn.PopcornsAPI.entities;



import javax.persistence.*;
import java.util.Date;

@Entity(name = "movies")
@Table(name = "movies")

public class Movie {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer ID;
    @Column(
            name = "title",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String title;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="userId", nullable=false)
    private User addedBy;
    @Temporal(TemporalType.DATE)
    @Column(
            name = "createdAt",
            nullable = false
    )
    private Date createdAt;
    @Temporal(TemporalType.DATE)
    @Column(
            name = "updatedAt",
            nullable = false
    )
    private Date UpdatedAt;

    public Movie(Integer ID, String title, User addedBy, Date createdAt, Date updatedAt) {
        this.ID = ID;
        this.title = title;
        this.addedBy = addedBy;
        this.createdAt = createdAt;
        UpdatedAt = updatedAt;
    }

    public Integer getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }

}
