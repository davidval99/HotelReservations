package com.proyecto.example.services;

import com.proyecto.example.modelo.Hotel;

public interface HotelServices {

    com.proyecto.example.daos.HotelDAO HotelDAO = null;

    public Hotel Create(String name, int score, String country, String region, String roomType);

}
