package project;

import project.engine.Buffer;
import project.engine.Game;
import project.engine.GameTime;

import java.awt.*;

public class chessGame extends Game {

    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;

    public chessGame() {
        initPlayers();
        initBoard();
    }

    @Override
    public void update() {
        if (Mouse.hasClicked) {
            board.selectTile(Mouse.mouseX, Mouse.mouseY);
            Mouse.hasClicked = false;
        }
    }

    @Override
    public void draw(Buffer buffer) {
        board.draw(buffer);
        buffer.drawText(GameTime.getElapsedFormattedTime(), 222,20, Color.WHITE);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void conclude() {

    }

    private void initBoard() {
        board = new Board();
    }

    private void initPlayers() {
        whitePlayer = new Player(1);
        blackPlayer = new Player(0);
    }
}
