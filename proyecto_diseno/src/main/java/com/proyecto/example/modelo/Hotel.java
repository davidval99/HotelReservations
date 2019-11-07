package com.proyecto.example.modelo;

import java.util.Objects;

public class Hotel {
    private Long id;
    private String name;
    private float  score;
    private String country;
    private String region;
    private int roomType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", roomType=" + roomType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Float.compare(hotel.score, score) == 0 &&
                Objects.equals(id, hotel.id) &&
                Objects.equals(name, hotel.name) &&
                Objects.equals(country, hotel.country) &&
                Objects.equals(region, hotel.region) &&
                Objects.equals(roomType, hotel.roomType);
    }

}
