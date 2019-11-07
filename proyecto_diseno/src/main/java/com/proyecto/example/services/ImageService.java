package com.proyecto.example.services;

import com.proyecto.example.daos.*;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;


public interface ImageService {

    ImageDAO ImageDAO = null;

    public Image insert(InputStream imput);

    public OutputStream retrive(int imageId);

}
