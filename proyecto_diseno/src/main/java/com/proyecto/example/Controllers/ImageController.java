package com.proyecto.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {


    @GetMapping(value="/asd")
    public String prueba(){
        return "asdasd";
    }


    public void retrieve(int imageID){

    }
}
