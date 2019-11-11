package com.proyecto.example.modelo;

import java.util.Objects;

public class ImageRoom {
    private int id;
    private int roomId;
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ImageRoom{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", path='" + path + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ImageRoom imageRoom = (ImageRoom) object;
        return id == imageRoom.id &&
                roomId == imageRoom.roomId &&
                Objects.equals(path, imageRoom.path);
    }
}