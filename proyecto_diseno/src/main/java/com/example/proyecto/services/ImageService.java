package services;

import daos.ImageDAO;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;


public interface ImageService {

    daos.ImageDAO ImageDAO = null;

    public Image insert(InputStream imput);

    public OutputStream retrive(int imageId);

}
