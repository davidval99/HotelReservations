package com.proyecto.example.daos;

import com.proyecto.example.modelo.Room;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class JdbcRoomDAO implements RoomDAO {


    public Connection connection = null;
    public ResultSet rs = null;
    public Statement s = null;

    public Room findByID(int id) {



        return null;
    }





    public Optional<Room> findById(String id) throws SQLException{

        s = connection.createStatement();

        String sql= "select * from Room where id = "+id+"";

        Optional<Room> listSelected = Optional.of(new Room());;

        while(rs.next()) {

            Boolean available = rs.getBoolean("available");
            String type = rs.getString("type");

            listSelected.get().setType(type);
            listSelected.get().setId(id);
            listSelected.get().setAvailable(available);

        }

        return listSelected;

    }
    public Optional<Room> findByType(String type) throws SQLException {

        s = connection.createStatement();

        String sql= "select * from Room where type = "+type+"";


        Optional<Room> listSelected = Optional.of(new Room());;

        while(rs.next()) {

            Boolean available = rs.getBoolean("available");
            String id = rs.getString("id");

            listSelected.get().setType(type);
            listSelected.get().setId(id);
            listSelected.get().setAvailable(available);

        }

        return listSelected;

    }

    @Override
    public boolean isAvailable(int id) throws SQLException {

        s = connection.createStatement();

        String sql= "select * from Room where id = "+id+"";




        while(rs.next()) {

            Boolean available = rs.getBoolean("available");
            return available;

        }

        return false;

    }


}
