package com.example.proyecto.daos;

import java.util.List;

import com.example.proyecto.modelo.ImageHotel;
import com.example.proyecto.modelo.ImageRoom;

public interface ImageDAO {
    public List<ImageRoom> findByRoomId(int roomId);
    public List<ImageHotel> findByHotelId(int hotelId);


}
