package com.mars.mars_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="bot")
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bot_id", nullable = false)
    private Long bot_id;

    @Column(name="name")
    private String name;

    @Column(name="lat")
    private Double lat;

    @Column(name="lng")
    private Double lng;

    @Column(name="owner_id")
    private Long owner_id;

    @Column(name="image")
    private String image;

    public Bot(){}
    public Bot(Long bot_id, String name, Double lat, Double lng, Long owner_id, String image) {
        this.bot_id = bot_id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.owner_id = owner_id;
        this.image = image;
    }

    public Long getBot_id() {
        return bot_id;
    }

    public void setBot_id(Long bot_id) {
        this.bot_id = bot_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
