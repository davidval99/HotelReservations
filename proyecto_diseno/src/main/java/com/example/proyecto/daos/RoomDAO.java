package com.example.proyecto.daos;

import com.example.proyecto.modelo.Room;

import java.util.Optional;

public interface RoomDAO {

    public Optional<Room> findByID(int id);

    public boolean isAvailable(int id);
}

