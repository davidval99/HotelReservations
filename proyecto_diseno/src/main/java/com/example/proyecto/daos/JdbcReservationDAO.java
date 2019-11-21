/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.daos;

import com.example.proyecto.modelo.Conexion;
import com.example.proyecto.modelo.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcReservationDAO implements ReservationDAO {


    @Override
    //Este metodo crea una nueva reservacion
    //Recibe un objeto de tipo Reservation y lo desmenusa para insertar a la base de datos
    public Optional<Reservation> CreateReservation(Reservation reserva) {

        Connection co = null;
        String sql="INSERT INTO reserva(habitacion_id_fk,usuario_id_fk,fecha_inicio,fecha_fin) VALUES(?,?,?,?);";
        try{
            co = Conexion.conectar();
            PreparedStatement pstm = co.prepareStatement(sql);
            pstm.setInt(1,reserva.getRoomId());
            pstm.setInt(2,reserva.getUserId());
            pstm.setDate(3, (Date) reserva.getCheckInDate());
            pstm.setDate(4, (Date) reserva.getCheckOutDate());
            pstm.executeUpdate();
            System.out.print(sql);
            pstm.close();
            co.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo insertar la reservacion");
            e.printStackTrace();
        }
        return Optional.empty();

    }
    @Override
    //Este metodo nos retorna el arreglo con las reservaciones existentes en la base de de datos
    public ArrayList<Reservation> findBy() {
        Connection co = null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT r.reserva_id,u.nombre,u.apellido1,u.apellido2,hot.nombre,h.tipo,r.fecha_inicio,r.fecha_fin\n" +
                "FROM reserva r \n" +
                "inner join habitacion h \n" +
                "on r.habitacion_id_fk = h.habitacion_id\n" +
                "inner join hotel hot\n" +
                "on h.habitacion_id = hot.hotel_id\n" +
                "inner join usuario u\n" +
                "on r.usuario_id_fk = u.usuario_id;";
        ArrayList<Reservation> listaReserva= new ArrayList<Reservation>();

        try {
            co = Conexion.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Reservation r=new Reservation();

                r.setId(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setLastName(rs.getString(3));
                r.setLastName2(rs.getString(4));
                r.setNameHotel(rs.getString(5));
                r.setRoomType(rs.getString(6));
                r.setCheckInDate(rs.getDate(7));
                r.setCheckOutDate(rs.getDate(8));
                listaReserva.add(r);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar las reservaciones");
            e.printStackTrace();
        }
        return listaReserva;
    }
}