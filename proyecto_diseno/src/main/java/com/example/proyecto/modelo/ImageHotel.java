package com.example.proyecto.modelo;

import java.util.Objects;

public class ImageHotel {
    private int id;
    private int hotelId;
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ImageHotel{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", path='" + path + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ImageHotel that = (ImageHotel) object;
        return id == that.id &&
                hotelId == that.hotelId &&
                java.util.Objects.equals(path, that.path);
    }
}
