package services;

public interface ReservationService {



    public Reservation create(String room, String name, String lastName, int bornDate, String email, date checkInDate, date checkOutDate);

    public Reservation update(date checkInDate, date checkOutDate);
}
