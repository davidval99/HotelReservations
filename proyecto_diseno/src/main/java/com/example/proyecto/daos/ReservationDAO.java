/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.daos;

import com.example.proyecto.modelo.Reservation;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservationDAO {

    public String prueba();

    public Optional<Reservation> CreateReservation(int roomId, int userId, String name, String lastName, String email, Date checkInDate, Date checkOutDate, int creditCard);
    
    public int CreateUser(String name, String lastName, String lastName2, String email, int creditCardNumber);

    public Optional<Reservation> update(Date checkInDate, Date checkOutDate);

    public List<Reservation> findBy();

}
