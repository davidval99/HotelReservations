package services;

public interface HotelService {

    daos.HotelDAO HotelDAO = null;

    public Hotel Create(String name,int score,String country, String region, String roomType);

}
