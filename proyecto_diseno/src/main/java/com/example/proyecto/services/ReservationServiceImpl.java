package com.example.proyecto.services;

import com.proyecto.example.daos.ReservationDAO;
import com.proyecto.example.modelo.Reservation;

import java.util.Date;

public class ReservationServiceImpl implements ReservationService {

    com.proyecto.example.daos.ReservationDAO ReservationDAO;

    @Override
    public Reservation create(String room, String name, String lastName, int bornDate, String email, Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public Reservation update(Date checkInDate, Date checkOutDate) {
        return null;
    }
}
