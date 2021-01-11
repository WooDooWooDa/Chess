package project;

import project.engine.Buffer;
import project.engine.entities.StaticEntity;
import project.pieces.Piece;

import java.awt.*;

public class Tile extends StaticEntity {

    private final Color originalColor;
    private final Color selectedColor = new Color(184, 45, 45);

    private Color bgColor;
    private Piece onTilePiece;
    private boolean isSelected = false;

    public Tile(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        width = 64;
        height = 64;
        bgColor = color;
        originalColor = color;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public boolean isEmpty() {
        return onTilePiece == null;
    }

    public void setPiece(Piece piece) {
        onTilePiece = piece;
    }

    public void unSelect() {
        isSelected = false;
        bgColor = originalColor;
    }

    public void select() {
        isSelected = true;
        bgColor = selectedColor;
    }

    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y + 38, width, height, bgColor);
        if (onTilePiece != null) {
            onTilePiece.draw(x ,y + 38, buffer);
        }
        /*if (isSelected) {
            buffer.drawRectangle(x, y  + 38, width, 2, Color.RED);
            buffer.drawRectangle(x, y  + 38, 2, height, Color.RED);

            buffer.drawRectangle(x, y  + 100, width, 2, Color.RED);
            buffer.drawRectangle(x + 62, y + 38, 2, height, Color.RED);
        }*/
    }
}
