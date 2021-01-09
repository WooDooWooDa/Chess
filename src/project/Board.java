package project;

import project.engine.Buffer;

import java.awt.*;

public class Board {

    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[8][8];
        initTiles();
    }

    private void initTiles() {
        boolean black = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color color;
                if (black) {
                    color = Color.BLACK;
                } else {
                    color = Color.WHITE;
                }
                tiles[i][j] = new Tile(i * 64, j * 64, color);
                black = !black;
            }
            black = !black;
        }
    }

    public void draw(Buffer buffer) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j].draw(buffer);
            }
        }
    }
}
