package com.mars.mars_backend.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="flame")
public class Flame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "flame_id", nullable = false)
    private Long flame_id;

    public Long getFlameid() {
        return flame_id;
    }
    @Column(name="bot_id")
    private Long bot_id;

    @Column(name="value")
    private Boolean value;

    @Column(name="verified")
    private Boolean verified;

    @Column(name="time")
    private Date time;

    @Column(name="lat")
    private Double lat;

    @Column(name="lng")
    private Double lng;

    public Flame(){}

    public Flame(Long flame_id, Long bot_id, Boolean value, Boolean verified, Date time, Double lat, Double lng) {
        this.flame_id = flame_id;
        this.bot_id = bot_id;
        this.value = value;
        this.verified = verified;
        this.time = time;
        this.lat = lat;
        this.lng = lng;
    }

    public Long getBot_id() {
        return bot_id;
    }

    public void setBot_id(Long bot_id) {
        this.bot_id = bot_id;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public Long getFlame_id() {
        return flame_id;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public void setFlame_id(Long flame_id) {
        this.flame_id = flame_id;
    }
}
