package com.proyecto.example.Controllers;

import com.proyecto.example.modelo.Reservation;
import com.proyecto.example.services.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationServiceImpl ReservationServiceImpl;

    @GetMapping(value="/createReservation")
    public String Create(Integer room, String name, String lastName, Date bornDate, String email,
                       Date checkInDate, Date checkOutDate, Integer creditCardNumber){

        Optional<Reservation> opcional = Optional.empty();
        //String opcional = "";
        opcional = ReservationServiceImpl.create(room,name,lastName,bornDate,email,checkInDate,checkOutDate,creditCardNumber);

        /*
        if(opcional == null){
            return "Vacio";
        }else{
            return "No Vacio";
        }
        */
        return "asqwe";
    }

    public void Update(Date checkInDate, Date checkOutDate){

    }






}
