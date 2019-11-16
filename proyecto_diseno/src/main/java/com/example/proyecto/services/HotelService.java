package com.example.proyecto.services;

import com.example.proyecto.daos.HotelDAO;
import com.example.proyecto.modelo.Hotel;

public interface HotelService {

    com.example.proyecto.daos.HotelDAO HotelDAO = null;

    public String conexion();

    public Hotel Create(String name, int score, String country, String region, String roomType);

}
