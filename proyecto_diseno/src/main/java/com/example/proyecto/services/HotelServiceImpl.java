package com.example.proyecto.services;

import com.example.proyecto.modelo.Hotel;

public class HotelServiceImpl implements HotelService {
    @Override
    public Hotel Create(String name, int score, String country, String region, String roomType) {
        return null;
    }

    @Override
    public String conexion(){return HotelDAO.conexion();}
}

