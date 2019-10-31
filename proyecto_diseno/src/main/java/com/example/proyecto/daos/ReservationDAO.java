package daos;

import java.util.Date;

public interface ReservationDAO {
    public Reservation Create(int roomID, String name, String lastName, Date bornDate, String email, int creditCardNumber);


    public Reservation update(Date checkInDate, Date checkOutDate);

    public Reservation findByName(String name);

}
