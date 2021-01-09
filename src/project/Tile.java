package project;

import project.engine.Buffer;
import project.engine.entities.StaticEntity;

import java.awt.*;

public class Tile extends StaticEntity {

    private Color bgColor;
    private Piece onTilePiece;

    public Tile(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        width = 64;
        height = 64;
        bgColor = color;
    }

    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, bgColor);
    }
}
