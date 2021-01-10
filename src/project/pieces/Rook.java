package project.pieces;

import project.GameResources;
import project.engine.Buffer;

import java.awt.*;

public class Rook extends Piece {

    private static Image whitePiece = GameResources.getInstance().getImage("rook");
    private static Image blackPiece = GameResources.getInstance().getImage("blackRook");

    public Rook(int color) {
        if (color == 1) {
            setImage(whitePiece);
            return;
        }
        setImage(blackPiece);
    }

    @Override
    public void draw(Buffer buffer) {

    }
}
