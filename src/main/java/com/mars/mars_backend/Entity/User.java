package com.mars.mars_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="site_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name="is_researcher")
    private Boolean isResearcher;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="user_type")
    private String user_type;

    @Column(name="institute")
    private String institute;

    @Column(name="address")
    private String address;

    @Column(name="image")
    private String image;

    public User(){}

    public User(Long user_id, Boolean isResearcher, String email, String name, String user_type, String institute, String address, String image) {
        this.user_id = user_id;
        this.isResearcher = isResearcher;
        this.email = email;
        this.name = name;
        this.user_type = user_type;
        this.institute = institute;
        this.address = address;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getResearcher() {
        return isResearcher;
    }

    public void setResearcher(Boolean researcher) {
        isResearcher = researcher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
