package com.mars.mars_backend.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="hum")
public class Humidity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "hum_id", nullable = false)
    private Long hum_id;

    public Long getHum_id() {
        return hum_id;
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

    public Humidity(){}
    public Humidity(Long hum_id, Long bot_id, Double value, Date time, Double lat, Double lng) {
        this.hum_id = hum_id;
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

    public void setHum_id(Long hum_id) {
        this.hum_id = hum_id;
    }
}
