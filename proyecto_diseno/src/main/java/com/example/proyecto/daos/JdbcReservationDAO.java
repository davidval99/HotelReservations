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
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcReservationDAO implements ReservationDAO {


    @Override
    //Esta funcion nos retorna el id mas grande de un usuario de la base de datos y nos sirve para insertar uno nuevo
    public int getIdUser(){
        int id = 1;
        Connection co= null;
        Statement stm = null;
        ResultSet rs= null;
        String sql = "SELECT MAX(usuario_id) from usuario;";
        try{
            co = Conexion.conectar();
            stm=co.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                id += rs.getInt(1);
            }
            stm.close();
            co.close();
        }  catch (SQLException e){
            System.out.println("Error: No se pudo obtener el max id del usuario");
            e.printStackTrace();
        }
        return id;
    }
    @Override
    //Este metodo nos retorna el id mas grande de las reservaciones creadas y nos sirve para crear una nueva reservacion
    public int getIdReservation(){
        int idR = 1;
        Connection co= null;
        Statement stm = null;
        ResultSet rs= null;
        String sql = "SELECT MAX(reserva_id) from reserva;";
        try{
            co = Conexion.conectar();
            stm=co.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                idR += rs.getInt(1);
            }
            stm.close();
            co.close();
        }  catch (SQLException e){
            System.out.println("Error: No se pudo obtener el max id del usuario");
            e.printStackTrace();
        }
        return idR;
    }
    @Override
    //Este metodo crea una nueva reservacion
    //Recibe un objeto de tipo Reservation y lo desmenusa para insertar a la base de datos
    public Optional<Reservation> CreateReservation(Reservation reserva) {
        int reservationID = getIdReservation();
        int userID = getIdUser();
        userID = userID - 1;
        Connection co = null;
        String sql="INSERT INTO reserva(reserva_id,habitacion_id_fk,usuario_id_fk,fecha_inicio,fecha_fin) VALUES(?,?,?,?,?);";
        try{
            co = Conexion.conectar();
            PreparedStatement pstm = co.prepareStatement(sql);
            pstm.setInt(1,reservationID);
            pstm.setInt(2,reserva.getRoomId());
            pstm.setInt(3,userID);
            pstm.setDate(4, (Date) reserva.getCheckInDate());
            pstm.setDate(5, (Date) reserva.getCheckOutDate());
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

        String sql="SELECT r.reserva_id, r.habitacion_id_fk, r.fecha_inicio, r.fecha_fin, u.nombre, u.apellido1, u.apellido2, u.correo,u.num_tarjeta FROM reserva r inner join usuario u on r.usuario_id_fk = u.usuario_id;";
        ArrayList<Reservation> listaReserva= new ArrayList<Reservation>();

        try {
            co = Conexion.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Reservation r=new Reservation();
                r.setId(rs.getInt(1));
                r.setRoomId(rs.getInt(2));
                r.setCheckInDate(rs.getDate(3));
                r.setCheckOutDate(rs.getDate(4));
                r.setName(rs.getString(5));
                r.setLastName(rs.getString(6));
                r.setLastName2(rs.getString(7));
                r.setEmail(rs.getString(8));
                r.setCreditCardNumber(rs.getInt(9));
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