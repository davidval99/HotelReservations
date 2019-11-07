package com.proyecto.example.services;

import com.proyecto.example.modelo.Reservation;

import java.util.Date;
import java.util.Optional;

public interface ReservationService {



    public Optional<Reservation> create(int room, String name, String lastName, Date bornDate, String email, Date checkInDate, Date checkOutDate, int creditCardNumber);

    public Optional<Reservation> update(Date checkInDate, Date checkOutDate);
}
