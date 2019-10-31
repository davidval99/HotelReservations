package daos;

public interface ImageDAO {
    public Image insert(int hotelId);
    public Image findByHotelId(int hotelId);


}
