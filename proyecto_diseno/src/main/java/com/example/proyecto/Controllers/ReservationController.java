package com.example.proyecto.Controllers;

import com.example.proyecto.services.ReservationService;
import com.example.proyecto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ReservationController {

    @Autowired
    com.example.proyecto.services.ReservationService ReservationService;

    @GetMapping(value = "/")
    public String prueba(){return "esto es una prueba";}

    @PostMapping
    public String Create(int room, int userId, String name, String lastName, Date bornDate, String email,
                                       Date checkInDate, Date checkOutDate, int creditCard){
        return ReservationService.CreateReservation(room,userId,name,lastName,email,checkInDate,checkOutDate,creditCard).toString();
    }

    @PostMapping
    public Reservation Update(Date checkInDate, Date checkOutDate){
        return null;
    }






}
