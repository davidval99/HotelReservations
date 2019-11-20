package com.example.proyecto.services;


import com.example.proyecto.daos.ImageDAO;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;


public interface ImageService {

    ImageDAO ImageDAO = null;

    public Image insert(InputStream imput);

    public OutputStream retrive(int imageId);

}
