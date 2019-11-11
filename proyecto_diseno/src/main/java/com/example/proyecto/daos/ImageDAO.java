package com.example.proyecto.daos;

import java.util.List;

import com.proyecto.example.modelo.ImageRoom;
import com.proyecto.example.modelo.ImageHotel;

public interface ImageDAO {
    public List<ImageRoom> findByRoomId(int roomId);
    public List<ImageHotel> findByHotelId(int hotelId);


}
