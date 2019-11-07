package daos;

import java.util.List;

public interface ImageDAO {
    public List<ImageRoom> findByRoomId(int roomId);
    public List<ImageHotel> findByHotelId(int hotelId);


}
