package com.example.proyecto.services;

import com.example.proyecto.modelo.Reservation;

import java.util.Date;
import java.util.Optional;

public interface ReservationService {



    public Optional<Reservation> CreateReservation(int room, int userId, String name, String lastName, String email, Date checkInDate, Date checkOutDate, int creditCard);

    public Reservation update(Date checkInDate, Date checkOutDate);
}
