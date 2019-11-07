package com.proyecto.example.modelo;

import java.util.Objects;

public class Image {
    private String id;
    private String hotelId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", hotelId='" + hotelId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id) &&
                Objects.equals(hotelId, image.hotelId);
    }

}
