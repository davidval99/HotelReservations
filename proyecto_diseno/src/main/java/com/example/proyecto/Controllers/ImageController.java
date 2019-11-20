package com.example.proyecto.Controllers;

import com.example.proyecto.modelo.ImageHotel;
import com.example.proyecto.modelo.ImageRoom;
import com.example.proyecto.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

@RestController
public class ImageController {

    @Autowired
    ImageService ImageService;

    @RequestMapping(value = "/retrieveRoomImages/{roomId}", method = RequestMethod.GET)
    public @ResponseBody ArrayList<ImageRoom> retrieveRoomImages(@PathVariable("roomId") int roomId) {
        return ImageService.retrieveRoomImages(roomId);
    }

    @RequestMapping(value="/retrieveHotelImages/{hotelId}", method = RequestMethod.GET)
    public @ResponseBody ArrayList<ImageHotel> retrieveHotelImages(@PathVariable("hotelId") int hotelId) {
        return ImageService.retrieveHotelImages(hotelId);
    }
}
