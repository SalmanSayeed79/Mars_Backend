package com.mars.mars_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="rfid_bot")
public class RFID_Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "bot_id", nullable = false)
    private Long bot_id;

    @Column(name="owner_email")
    private String ownerEmail;

    @Column(name="title")
    private String title;

    @Column(name="subtitle")
    private String subtitle;

    public RFID_Bot(){}
    public RFID_Bot(Long bot_id, String ownerEmail, String title, String subtitle) {
        this.bot_id = bot_id;
        this.ownerEmail = ownerEmail;
        this.title = title;
        this.subtitle = subtitle;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
