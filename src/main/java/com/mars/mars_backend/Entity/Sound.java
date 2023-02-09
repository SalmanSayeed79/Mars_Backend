package com.mars.mars_backend.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="sound")
public class Sound {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sound_id", nullable = false)
    private Long sound_id;

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

    public Sound(){}

    public Sound(Long sound_id, Long bot_id, Boolean value, Boolean verified, Date time, Double lat, Double lng) {
        this.sound_id = sound_id;
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

    public Long getSound_id() {
        return sound_id;
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

    public void setSound_id(Long sound_id) {
        this.sound_id = sound_id;
    }
}
