package daos;

public class JdbcRoomDAO implements RoomDAO {
    @Override
    public Room findByID(int id) {
        return null;
    }

    @Override
    public boolean isAvailable(int id) {
        return false;
    }
}
