package com.example.proyecto.services;

import com.example.proyecto.daos.HotelDAO;
import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.modelo.Reservation;

import java.util.List;

public interface HotelServices {

    HotelDAO HotelDAO = null;

    public Hotel Create(String name, int score, String country, String region, String roomType);

    public List<Hotel> findBy();
}

