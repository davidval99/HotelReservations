package services;

public interface HotelServicesImpl {

    daos.HotelDAO HotelDAO = null;

    public Hotel Create(String name,int score,String country, String region, String roomType);

}

