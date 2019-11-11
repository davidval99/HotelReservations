package com.proyecto.example.daos;

import com.proyecto.example.modelo.Room;

import java.sql.SQLException;

public interface RoomDAO {

    public Room findByID(int id);

    public boolean isAvailable(int id) throws SQLException;
}

