package com.example.proyecto.services;

import com.proyecto.example.daos.HotelDAO;
import com.proyecto.example.modelo.Hotel;

public interface HotelServicesImpl {

    HotelDAO HotelDAO = null;

    public Hotel Create(String name, int score, String country, String region, String roomType);

}

