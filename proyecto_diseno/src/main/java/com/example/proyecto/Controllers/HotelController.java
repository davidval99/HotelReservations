package com.example.proyecto.Controllers;


import com.example.proyecto.modelo.Conexion;
import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.modelo.Reservation;
import com.example.proyecto.services.HotelServiceImpl;
import com.example.proyecto.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
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

    @RequestMapping(value = "/listHotelNamePrueba/{name}", method = RequestMethod.GET)
    public @ResponseBody Hotel pruebaHotel(@PathVariable("name") String name) {
        return hotelService.findByName(name);
    }

    @GetMapping(value = "/listHotelName/{name}")
    @ResponseBody
    public String listHotelName( @PathVariable("name") String name) {
            return hotelService.findByName(name).toString();
    }

    @GetMapping(value = "/prueba/{name}")
    @ResponseBody
    public String prueba( @PathVariable("name") String name) {
        return name;
    }

}
