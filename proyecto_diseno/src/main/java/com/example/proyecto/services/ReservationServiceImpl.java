package com.example.proyecto.services;

import com.example.proyecto.daos.ReservationDAO;
import com.example.proyecto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationDAO ReservationDAO;

    @Override
    public Optional<Reservation> CreateReservation(int room, int userId, Date checkInDate, Date checkOutDate, int creditCard) {
        Reservation reservation = new Reservation();
        reservation.setRoomId(room);
        reservation.setUserId(userId);
        reservation.setCheckInDate(checkInDate);
        reservation.setCheckOutDate(checkOutDate);
        reservation.setCreditCardNumber(creditCard);
        return ReservationDAO.CreateReservation(reservation);
    }

    @Override
    public Reservation update(Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public List<Reservation> findBy(){return ReservationDAO.findBy();}

}
