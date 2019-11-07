package com.proyecto.example.daos;

import com.proyecto.example.modelo.Reservation;
import java.util.Date;
import java.util.Optional;

public interface ReservationDAO {


    public Optional<Reservation> update(Date checkInDate, Date checkOutDate);

    public Optional<Reservation> findByName(String name);

    public Optional<Reservation> Create(int room, String name, String lastName, Date bornDate, String email, Date checkInDate, Date checkOutDate, int creditCardNumber);
}
