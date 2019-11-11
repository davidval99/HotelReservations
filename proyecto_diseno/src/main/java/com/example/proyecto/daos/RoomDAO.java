package daos;

public interface RoomDAO {

    public Room findByID(int id);

    public boolean isAvailable(int id);
}

