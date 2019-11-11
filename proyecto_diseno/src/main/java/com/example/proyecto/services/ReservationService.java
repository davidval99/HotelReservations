package com.example.proyecto.services;

import com.proyecto.example.modelo.Reservation;

import java.util.Date;

public interface ReservationService {



    public Reservation create(String room, String name, String lastName, int bornDate, String email, Date checkInDate, Date checkOutDate);

    public Reservation update(Date checkInDate, Date checkOutDate);
}
