package com.example.proyecto.services;

import com.example.proyecto.daos.ReservationDAO;
import com.example.proyecto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationDAO ReservationDAO;

    @Override
    public Optional<Reservation> CreateReservation(int room, int userId, String name, String lastName, String email, Date checkInDate, Date checkOutDate, int creditCard) {
        return ReservationDAO.CreateReservation(room, userId, name,lastName ,email,checkInDate,checkOutDate,creditCard);
    }

    @Override
    public Reservation update(Date checkInDate, Date checkOutDate) {
        return null;
    }
}
