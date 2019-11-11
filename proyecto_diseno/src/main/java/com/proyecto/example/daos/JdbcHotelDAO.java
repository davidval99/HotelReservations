package com.proyecto.example.daos;

import com.proyecto.example.modelo.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

public class JdbcHotelDAO {

    // es para que no me de errores de que no existen las variables pero estas
    // variables van dentro de la clase de conexión a la base


    public Connection connection = null;
    public ResultSet rs = null;
    public Statement s = null;

    //------------------------------------------------------------------------------------------------------------------

    public Hotel createHotel(Hotel hotel) throws SQLException{


        String name = hotel.getName();
        Float score = hotel.getScore();
        String country = hotel.getCountry();
        String region = hotel.getRegion();
        int roomType = hotel.getRoomType();

        s = connection.createStatement();

        String sql = "insert into Hotel (name, score, country, region, roomType) " +
                "values ('"+name+"','"+score+"', '"+country+"', '"+region+"', '"+roomType+"')";

        rs = s.executeQuery(sql);

        return hotel;
    }


    //------------------------------------------------------------------------------------------------------------------
    /*
        en esta función servirá para
            -findByName
            -findByScore
            -findByCountry
            -findByRegion
            -findByRoomType

        La idea de las funciones antes mencionadas es que todas harían lo mismo, entonces se tiene una sola función
        (findByAll) para evitar la duplicación de código.

     *****/

    public Optional<ArrayList<Hotel>> findByAll(String Valor) throws SQLException {

        s = connection.createStatement();
        String sql = "select * from Hotel where region = "+Valor+"";

        rs = s.executeQuery(sql);
        int count =0;

        while(rs.next()){
            count += 1;
        }

        rs = s.executeQuery(sql);
        Optional<ArrayList<Hotel>> listaHoteles = Optional.of(new ArrayList<Hotel>());

        int i = 0;
        while(rs.next()){

            Long id = rs.getLong("id");
            String name = rs.getString("name");
            Float score = rs.getFloat("score");
            String country = rs.getString("country");
            String region = rs.getString("region");
            int roomType = rs.getInt("roomType");

            Hotel hotel = new Hotel();
            hotel.setId(id);
            hotel.setName(name);
            hotel.setScore(score);
            hotel.setCountry(country);
            hotel.setRegion(region);
            hotel.setRoomType(roomType);

            listaHoteles.get().add(hotel);
            i+=1;

        }

        return listaHoteles;
    }


    //------------------------------------------------------------------------------------------------------------------

    public Optional<Hotel> findById(Long hotelId) throws SQLException {

        s = connection.createStatement();
        String sql = "select * from Hotel where region = "+hotelId+"";

        rs = s.executeQuery(sql);

        Optional<Hotel> hotel = Optional.of(new Hotel());

        while(rs.next()) {

            Long id = rs.getLong("id");
            String name = rs.getString("name");
            Float score = rs.getFloat("score");
            String country = rs.getString("country");
            int roomType = rs.getInt("roomType");
            String region = rs.getString("region");

            hotel.get().setId(id);
            hotel.get().setName(name);
            hotel.get().setScore(score);
            hotel.get().setCountry(country);
            hotel.get().setRegion(region);
            hotel.get().setRoomType(roomType);

        }

        return hotel;
    }

    //------------------------------------------------------------------------------------------------------------------


}
