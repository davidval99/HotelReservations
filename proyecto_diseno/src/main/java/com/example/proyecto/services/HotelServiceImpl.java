package com.example.proyecto.services;

import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.daos.JdbcHotelDAO;
import com.example.proyecto.modelo.ImageHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    JdbcHotelDAO hotelDao;

    @Override
    public Hotel Create(String name, int score, String country, String region, String roomType) {
        return null;
    }

    @Override
    public ArrayList<Hotel> listAllHotels(){return hotelDao.listAllHotels();}

    @Override
    public ArrayList<Hotel> listAllHotelsByPuntuation(){return hotelDao.listAllHotelsByPuntuation();}

    @Override
    public ArrayList<Hotel> listAllHotelsByCountry(){return hotelDao.listAllHotelsByCountry();}

    @Override
    public ArrayList<Hotel> listAllHotelsByRegion(){return hotelDao.listAllHotelsByRegion();}

    @Override
    public ArrayList<ImageHotel> listAllHotelsImage(){return hotelDao.listAllHotelsImage();}
}

