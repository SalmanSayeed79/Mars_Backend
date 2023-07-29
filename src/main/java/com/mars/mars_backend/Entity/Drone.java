package com.mars.mars_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="drone")
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bot_id", nullable = false)
    private Long bot_id;

    @Column(name="owner_email")
    private String ownerEmail;

    @Column(name="url")
    private String url;

    public Drone(Long bot_id, String ownerEmail, String url) {
        this.bot_id = bot_id;
        this.ownerEmail = ownerEmail;
        this.url = url;
    }
    public Drone(){

    }

    public Long getBot_id() {
        return bot_id;
    }

    public void setBot_id(Long bot_id) {
        this.bot_id = bot_id;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
