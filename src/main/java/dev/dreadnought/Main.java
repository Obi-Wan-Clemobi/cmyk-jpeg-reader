package dev.dreadnought;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException, ImageReadException, ImageWriteException
    {
        JpegReader jpegReader = new JpegReader();
        BufferedImage newImage = jpegReader.readImage(new File("/Users/stormrage/Code/cmyk-poc/src/main/resources/childsplay.jpg"));

        Imaging.writeImage(newImage, new File("/Users/stormrage/Code/cmyk-poc/src/main/resources/newImage.png"), ImageFormats.PNG, null);
    }
}
