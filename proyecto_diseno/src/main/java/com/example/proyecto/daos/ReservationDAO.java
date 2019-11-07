/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.util.Date;
import java.util.List;

public interface ReservationDAO {
    public int CreateReservation(int roomId, int userId, String checkInDate, String checkOutDate);
    
    public int CreateUser(String name, String lastName, String lastName2, String email, int creditCardNumber);

    public Reservation update(Date checkInDate, Date checkOutDate);

    public List<Reservation> findBy();

}
