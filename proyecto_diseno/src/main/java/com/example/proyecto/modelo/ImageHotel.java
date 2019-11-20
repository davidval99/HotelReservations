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

    @Override
    public String toString() {
        return "ImageHotel{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageHotel that = (ImageHotel) o;
        return id == that.id &&
                hotelId == that.hotelId &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hotelId, path);
    }
}
