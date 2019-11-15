package com.example.proyecto.services;

import com.example.proyecto.daos.HotelDAO;
import com.example.proyecto.modelo.Hotel;

public interface HotelServicesImpl {

    HotelDAO HotelDAO = null;

    public Hotel Create(String name, int score, String country, String region, String roomType);

}

