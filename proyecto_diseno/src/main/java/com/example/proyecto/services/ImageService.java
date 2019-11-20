package com.example.proyecto.services;


import com.example.proyecto.daos.ImageDAO;
import com.example.proyecto.modelo.ImageHotel;
import com.example.proyecto.modelo.ImageRoom;

import java.awt.*;
import java.util.List;
import java.io.InputStream;
import java.io.OutputStream;


public interface ImageService {

    ImageDAO ImageDAO = null;

    public Image insert(InputStream imput);

    public List<ImageRoom> retrieveRoomImages(int roomId);

    public List<ImageHotel> retrieveHotelImages(int hotelId);


}
