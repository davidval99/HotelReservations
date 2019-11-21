package com.example.proyecto.Controllers;

import com.example.proyecto.modelo.Conexion;
import com.example.proyecto.modelo.ImageHotel;
import com.example.proyecto.modelo.User;
import com.example.proyecto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class UserController {

    @Autowired
    UserService UserService;

    @GetMapping(value = "/returnAllUser")
    public String returnAllUser(){return UserService.returnAllUser().toString();}


    @RequestMapping(value = "/returnUserDate", method = RequestMethod.GET)
    public @ResponseBody ArrayList<User> returnUserDate() throws ParseException {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date inicio = simpleDateFormat.parse("12-01-2018");
        Date fin = simpleDateFormat.parse("12-01-2018");


        return UserService.returnUserDate(inicio, fin);
    }

}
