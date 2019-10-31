package daos;

import java.util.Date;

public class JdbcReservationDAO implements ReservationDAO {
    @Override
    public Reservation Create(int roomID, String name, String lastName, Date bornDate, String email, int creditCardNumber) {
        return null;
    }

    @Override
    public Reservation update(Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public Reservation findByName(String name) {
        return null;
    }
}
