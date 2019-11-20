package com.example.proyecto.daos;

        import com.example.proyecto.modelo.Room;

        import java.util.Optional;

public class JdbcRoomDAO implements RoomDAO {
    @Override
    public Optional<Room> findByID(int id) {
        return null;
    }

    @Override
    public boolean isAvailable(int id) {
        return false;
    }
}
