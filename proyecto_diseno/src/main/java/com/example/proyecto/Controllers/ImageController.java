package com.example.proyecto.Controllers;

import com.example.proyecto.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
public class ImageController {

    @Autowired
    ImageService ImageService;

    public Image insert(InputStream input){
        return null;
    }

    @GetMapping(value="/retrieveRoomImages/{roomId}")
    public @ResponseBody String retrieveRoomImages(@PathVariable("roomId") int roomId) {return ImageService.retrieveRoomImages(roomId).toString();}

    @GetMapping(value="/retrieveHotelImages/{hotelId}")
    public @ResponseBody String retrieveHotelImages(@PathVariable("hotelId") int hotelId) {return ImageService.retrieveHotelImages(hotelId).toString();}
}
