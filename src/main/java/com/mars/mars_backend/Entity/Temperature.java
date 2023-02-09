package com.mars.mars_backend.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="temp")
public class Temperature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "temp_id", nullable = false)
    private Long temp_id;

    public Long getTemp_id() {
        return temp_id;
    }
    @Column(name="bot_id")
    private Long bot_id;

    @Column(name="value")
    private Double value;

    @Column(name="time")
    private Date time;

    @Column(name="lat")
    private Double lat;

    @Column(name="lng")
    private Double lng;

    public Temperature(){}
    public Temperature(Long temp_id, Long bot_id, Double value, Date time, Double lat, Double lng) {
        this.temp_id = temp_id;
        this.bot_id = bot_id;
        this.value = value;
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

    public void setTemp_id(Long temp_id) {
        this.temp_id = temp_id;
    }
}
