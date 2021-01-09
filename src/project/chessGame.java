package project;

import project.engine.Buffer;
import project.engine.Game;

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
