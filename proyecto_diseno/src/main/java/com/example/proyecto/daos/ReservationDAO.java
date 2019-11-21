/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.daos;

import com.example.proyecto.modelo.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservationDAO {

    public Optional<Reservation> CreateReservation(Reservation reserva);

    public int getIdReservation();

    public int getIdUser();

    public ArrayList<Reservation> findBy();


}
