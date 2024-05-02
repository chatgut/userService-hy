package com.example.labb2webservices.entity;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amountOfMessages;

    //@Lob?
    private String imageLink;

    private String userName;

    public User() {
    }

    //Behövs vanlig konstruktor också??
    //Hashcode och toString??

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmountOfMessages() {
        return amountOfMessages;
    }

    public void setAmountOfMessages(Integer amountOfMessages) {
        this.amountOfMessages = amountOfMessages;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
