package com.example.proyecto.daos;

import com.example.proyecto.modelo.Conexion;
import com.example.proyecto.modelo.Hotel;
import com.example.proyecto.modelo.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class JdbcHotelDAO implements HotelDAO {

    @Override
    public String conexion(){
        Connection co = null;
        co = Conexion.conectar();
        if(co != null) return "Conectado";
        else return "No conectado";
    }

    @Override
    public void Create(String name, int score, String country, String region, String roomType) {

    }

    @Override
    public void findByID(int id) {

    }

    @Override
    public void findByName(int id) {

    }

}