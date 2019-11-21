package com.example.proyecto.Controllers;

import com.example.proyecto.services.ReservationService;
import com.example.proyecto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationService ReservationService;

    @RequestMapping(value = "listarReservacione/", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Reservation> listar(){
        return ReservationService.findBy();
    }

    @RequestMapping(path = "/createReservation", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String createReservation(@RequestBody  PostDto postDto) {
        /*
        int userId;
        String name;
        String lastName;
        String email;
        Date checkInDate;
        Date checkOutDate;
        int creditCard;
        */
        return Integer.toString(postDto.getUserId()) + postDto.getName() + postDto.getLastName() + postDto.getEmail() +  Integer.toString(postDto.getCreditCard());
    }

}
