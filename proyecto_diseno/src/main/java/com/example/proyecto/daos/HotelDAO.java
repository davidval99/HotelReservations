package com.example.proyecto.daos;

import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.modelo.Reservation;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface HotelDAO {


    public String conexion();

    public void Create(String name,int score,String country, String region, String roomType);

    public void findByID(int id);

    public void findByName(int id);


}
