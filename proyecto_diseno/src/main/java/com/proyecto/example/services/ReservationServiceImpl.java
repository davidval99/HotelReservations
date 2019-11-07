package com.proyecto.example.services;

import com.proyecto.example.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    com.proyecto.example.daos.ReservationDAO ReservationDAO;

    @Autowired
    public ReservationServiceImpl(com.proyecto.example.daos.ReservationDAO reservationDao) {
        this.ReservationDAO = ReservationDAO;
    }

    @Override
    public Optional<Reservation> create(int room, String name, String lastName, Date bornDate, String email, Date checkInDate, Date checkOutDate, int creditCardNumber) {
        return ReservationDAO.Create(room,name,lastName,bornDate,email,checkInDate,checkOutDate,creditCardNumber);
    }

    @Override
    public Optional<Reservation> update(Date checkInDate, Date checkOutDate) {
        return ReservationDAO.update(checkInDate,checkOutDate);
    }
}
