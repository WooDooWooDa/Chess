package project;

import project.engine.Buffer;
import project.engine.entities.StaticEntity;
import project.pieces.Piece;

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

    public void setPiece(Piece piece) {
        onTilePiece = piece;
    }

    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y + 38, width, height, bgColor);
        if (onTilePiece != null) {
            onTilePiece.draw(x ,y + 38, buffer);
        }
    }
}
