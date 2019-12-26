package com.practice.krazybee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Album {

    @Id
    private Long id;

    private Long userId;

    private String title;

    private Date created_On;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated_On() {
        return created_On;
    }

    public void setCreated_On(Date created_On) {
        this.created_On = created_On;
    }
}
