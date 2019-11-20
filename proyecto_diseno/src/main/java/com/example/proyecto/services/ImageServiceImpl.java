package com.example.proyecto.services;


import com.example.proyecto.daos.ImageDAO;
import com.example.proyecto.modelo.ImageHotel;
import com.example.proyecto.modelo.ImageRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageDAO ImageDAO;

    @Override
    public Image insert(InputStream imput) {
        return null;
    }

    @Override
    public List<ImageRoom> retrieveRoomImages(int roomId) {return ImageDAO.findByRoomId(roomId);}

    @Override
    public List<ImageHotel> retrieveHotelImages(int hotelId) {return ImageDAO.findByHotelId(hotelId);}
}
