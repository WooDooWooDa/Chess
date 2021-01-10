package project.pieces;

import project.GameResources;
import project.engine.Buffer;

import java.awt.*;

public class Pawn extends Piece {

    private final static Image whitePiece = GameResources.getInstance().getImage("pawn");
    private final static Image blackPiece = GameResources.getInstance().getImage("blackPawn");

    public Pawn(int color) {
        if (color == 1) {
            setImage(whitePiece, color);
            return;
        }
        setImage(blackPiece, color);
    }

    @Override
    public void draw(Buffer buffer) {

    }
}
