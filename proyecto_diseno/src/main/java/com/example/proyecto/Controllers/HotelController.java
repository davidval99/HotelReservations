package com.example.proyecto.Controllers;


import com.example.proyecto.modelo.Reservation;
import com.example.proyecto.services.HotelServiceImpl;
import com.example.proyecto.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.Optional;


@RestController
public class HotelController {

    @Autowired
    HotelServiceImpl hotelService;

    @GetMapping(value = "/listHotels")
    public String listarHoteles(){
        return hotelService.listAllHotels().toString();
    }

    @GetMapping(value = "/listHotelsPuntuation")
    public String listAllHotelsByPuntuation(){
        return hotelService.listAllHotelsByPuntuation().toString();
    }

    @GetMapping(value = "/listHotelsCountry")
    public String listAllHotelsByCountry(){
        return hotelService.listAllHotelsByCountry().toString();
    }

    @GetMapping(value = "/listHotelsRegion")
    public String listAllHotelsByRegion(){
        return hotelService.listAllHotelsByRegion().toString();
    }

    @GetMapping(value = "/listHotelsImage")
    public String listAllHotelsImage(){
        return hotelService.listAllHotelsImage().toString();
    }
}
