package project;

import project.engine.Buffer;
import project.engine.Game;
import project.engine.GameTime;

import java.awt.*;

public class chessGame extends Game {

    private Board board;

    public chessGame() {
        initPlayers();
        initBoard();
    }

    @Override
    public void update() {

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

    }
}
