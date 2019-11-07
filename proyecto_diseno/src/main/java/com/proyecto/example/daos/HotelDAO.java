package com.proyecto.example.daos;

public interface HotelDAO {
    public void Create(String name, int score, String country, String region, String roomType);

    public void findByID(int id);

    public void findByName(int id);
}
