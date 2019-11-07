package com.proyecto.example.daos;

import com.proyecto.example.modelo.Image;

public interface ImageDAO {
    public Image insert(int hotelId);
    public Image findByHotelId(int hotelId);


}
