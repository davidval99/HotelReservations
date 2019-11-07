/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcReservationDAO implements ReservationDAO {
    @Override
    public int CreateUser(String name, String lastName, String lastName2, String email, int creditCardNumber) {
        int id = 1;
        Connection co = null;
        Statement stm= null;
        ResultSet rs=null;
        
	String sql="SELECT max(usuario_id) from usuario;";
        String sql2="INSERT INTO usuario(usuario_id,nombre,apellido1,apellido2,correo,numTarjeta) VALUES("+id+",'"+name+"','"+lastName+"','"+lastName2+"','"+email+"',"+creditCardNumber+");";
	try {			
            co = Conexion.conexion();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            id += rs.getInt(1);
            stm.close();
            co.close();
	} catch (SQLException e) {
            System.out.println("Error: No se pudo obtener el id");
        }
        try{
            co = Conexion.conexion();
            stm = co.createStatement();
            stm.executeUpdate(sql2);
            stm.close();
            co.close();
        }
        catch(SQLException e){
            System.out.println("No se pudo insertar el usuario");
        }
        return id;
    }
    @Override
    public int CreateReservation(int roomId, int userId, String checkInDate, String checkOutDate) {
        int reservationID = 0;
        Connection co = null;
        Statement stm= null;
        ResultSet rs=null;
	String sql2="SELECT max(reserva_id) from reserva;";        
        String sql="INSERT INTO reserva(reserva_id,habitacion_id_fk,usuario_id_fk,fecha_inicio,fecha_fin) VALUES("+reservationID+","+roomId+","+userId+",'"+checkInDate+"','"+checkOutDate+"');";
        try {			
            co = Conexion.conexion();
            stm=co.createStatement();
            rs=stm.executeQuery(sql2);
            while (rs.next()) {
            reservationID = rs.getInt(1);
            }
            stm.close();
            co.close();
	} catch (SQLException e) {
            System.out.println("Error: No se pudo obtener el id");
        }
       	try {			
            co = Conexion.conexion();
            stm=co.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            co.close();
	} catch (SQLException e) {
            System.out.println("Error: No se pudo insertar la reserva");
        }
        return reservationID;
    }
    @Override
    public Reservation update(Date checkInDate, Date checkOutDate) {
        return null;
    }
    @Override
    public List<Reservation> findBy() {
        Connection co = null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT r.reserva_id, r.habitacion_id_fk, r.fecha_inicio, r.fecha_fin, u.nombre, u.apellido1,u.apellido2, u.correo,u.num_tarjeta FROM reserva r inner join usuario u on r.usuario_id_fk = u.usuario_id;";
        List<Reservation> listaReserva= new ArrayList<Reservation>();

        try {
            co = Conexion.conexion();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Reservation r=new Reservation();
                r.setId(rs.getInt(1));
                r.setRoomId(rs.getInt(2));
                r.setCheckInDate(rs.getString(3));
                r.setCheckOutDate(rs.getString(4));
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
        }
        return listaReserva;
    }
}