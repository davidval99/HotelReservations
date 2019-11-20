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
import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationService ReservationService;

    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);


    @GetMapping(value="/listarReservaciones")
    public String listar(){return ReservationService.findBy().toString();}

    @GetMapping(value = "/conexion")
    public String conexion(){

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "root");
        } catch (Exception e) {
            return e.getClass().getName()+": "+e.getMessage();

        }
        return "Opened database successfully";
    }



    @GetMapping(value = "/")
    public String prueba(){return "esto es una prueba";}


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
    @PostMapping(value = "/updateReservation")
    public String UpdateReservation(@RequestBody PostDto post){
        return "post";
    }

}
