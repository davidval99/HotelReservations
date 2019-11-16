package com.example.proyecto.Controllers;

import com.example.proyecto.services.ReservationService;
import com.example.proyecto.modelo.Reservation;
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


    @GetMapping(value = "/conexionHotel")
    public String conexion(){

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "johanherr1024");
        } catch (Exception e) {
            return e.getClass().getName()+": "+e.getMessage();

        }
        return "Opened database successfully tomela emanlui";
    }

}
