package com.example.proyecto.services;

import com.example.proyecto.modelo.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservationService {

    public Optional<Reservation> CreateReservation(int room, int userId, Date checkInDate, Date checkOutDate, int creditCard);

    public ArrayList<Reservation> findBy();

}
