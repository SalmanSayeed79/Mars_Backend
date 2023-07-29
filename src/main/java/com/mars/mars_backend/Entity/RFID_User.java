package com.mars.mars_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="rfid_user")
public class RFID_User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "rfid_user_id", nullable = false)
    private Long user_id;

    @Column(name="bot_id")
    private Long bot_id;

    @Column(name="rfid")
    private String rfid;
    @Column(name="name")
    private String name;

    @Column(name="designation")
    private String designation;

    public RFID_User(){}

    public RFID_User(Long user_id,String rfid, Long bot_id, String name, String designation) {
        this.user_id = user_id;
        this.rfid = rfid;
        this.bot_id = bot_id;
        this.name = name;
        this.designation = designation;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
