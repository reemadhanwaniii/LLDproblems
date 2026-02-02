package game;

import models.Board.Board;

public abstract class BoardGame {
    private final Board board;

    public BoardGame(Board board) {
        this.board = board;
    }

    public void startGame(){

    }
    protected abstract boolean isGameOver();
}
