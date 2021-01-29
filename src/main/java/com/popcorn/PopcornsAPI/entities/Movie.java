package com.popcorn.PopcornsAPI.entities;

import com.popcorn.PopcornsAPI.generic.Date;

public class Movie {

    private final Integer ID;
    private String title;
    private User addedBy;
    private Date createdAt;
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
