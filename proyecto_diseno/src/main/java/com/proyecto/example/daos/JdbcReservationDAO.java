package com.proyecto.example.daos;

import com.proyecto.example.modelo.Reservation;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JdbcReservationDAO implements ReservationDAO {
    @Override
    public Optional<Reservation> Create(int roomID, String name, String lastName, Date bornDate, String email,  Date checkInDate, Date checkOutDate, int creditCardNumber) {
        return Optional.empty();
    }

    @Override
    public Optional<Reservation> update(Date checkInDate, Date checkOutDate) {
        return Optional.empty();
    }

    @Override
    public Optional<Reservation> findByName(String name) {
        return Optional.empty();
    }
}
