/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.daos;

import com.proyecto.example.modelo.Reservation;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservationDAO {
    public int CreateReservation(int roomId, int userId, String checkInDate, String checkOutDate);
    
    public int CreateUser(String name, String lastName, String lastName2, String email, int creditCardNumber);

    public Optional<Reservation> update(Date checkInDate, Date checkOutDate);

    public List<Reservation> findBy();

}
