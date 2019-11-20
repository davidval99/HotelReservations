package com.example.proyecto.Controllers;


import com.example.proyecto.modelo.Conexion;
import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.modelo.ImageHotel;
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

    @RequestMapping(value = "/listHotels", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Hotel> listarHoteles(){
        return hotelService.listAllHotels();
    }

    @RequestMapping(value = "/listHotelsPuntuation", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Hotel> listAllHotelsByPuntuation(){
        return hotelService.listAllHotelsByPuntuation();
    }

    @RequestMapping(value = "/listHotelsCountry", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Hotel> listAllHotelsByCountry(){
        return hotelService.listAllHotelsByCountry();
    }

    @RequestMapping(value = "/listHotelsRegion", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Hotel> listAllHotelsByRegion(){
        return hotelService.listAllHotelsByRegion();
    }

    @RequestMapping(value = "/listHotelsImage", method = RequestMethod.GET)
    public @ResponseBody ArrayList<ImageHotel> listAllHotelsImage(){
        return hotelService.listAllHotelsImage();
    }

    @RequestMapping(value = "/listHotelName/{name}", method = RequestMethod.GET)
    public @ResponseBody Hotel listHotelName(@PathVariable("name") String name) {
        return hotelService.findByName(name);
    }


}
