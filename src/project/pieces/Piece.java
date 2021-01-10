package project.pieces;

import project.engine.Buffer;
import project.engine.entities.StaticEntity;

import java.awt.*;

public abstract class Piece extends StaticEntity {

    private Image image;

    public Piece() {
        x = 0;
        y = 0;
        height = 64;
        width = 64;
    }

    public void draw(int tileX, int tileY, Buffer buffer) {
        buffer.drawImage(image, x + tileX, y + tileY);
    }

    protected void setImage(Image image) {
        this.image = image;
    }
}
