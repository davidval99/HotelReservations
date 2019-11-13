package com.example.proyecto.Controllers;

import com.example.proyecto.services.ReservationService;
import com.example.proyecto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationService ReservationService;

    @GetMapping(value = "/")
    public String prueba(){return "esto es una prueba";}

    @GetMapping(value = "/prueba")
    public String pruebaURL(){return ReservationService.prueba();}

    @PostMapping(value = "/createReservation")
    public String CreateReservation(@RequestBody PostDto post){
        Optional<Reservation> r = ReservationService.CreateReservation(post.room,post.userId,post.name,post.lastName,post.email,post.checkInDate,post.checkOutDate,post.creditCard);
        return "Post completed";
    }

    @PostMapping(value = "/updateReservation")
    public String UpdateReservation(@RequestBody PostDto post){
        return "post";
    }

}
