package com.example.proyecto.Controllers;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PostDto {
    int room;
    int userId;
    String name;
    String lastName;
    String email;
    Date checkInDate;
    Date checkOutDate;
    int creditCard;

    public PostDto(int room, int userId, String name, String lastName, String email, Date checkInDate, Date checkOutDate, int creditCard) {
        this.room = room;
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.creditCard = creditCard;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
}
