package project;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

public class GameResources {

    private static project.GameResources instance;
    private HashMap<String, Image> allImages;
    private HashMap<String, BufferedImage> allBufferedImages;

    public static project.GameResources getInstance() {
        if (instance == null) {
            instance = new project.GameResources();
        }
        return instance;
    }

    public Image getImage(String key) {
        return allImages.get(key);
    }

    private GameResources() {
        allImages = new HashMap<>();
        allBufferedImages = new HashMap<>();
        loadImagesResources();
    }

    private void loadImagesResources() {
        try {
            allImages.put("rook", ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("whiteRook.png")));
            allImages.put("blackRook", ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("blackRook.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
