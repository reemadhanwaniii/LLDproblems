package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private final PieceName name;
    private final Color color;
    private boolean isKilled;
    private List<Move> moves;

    public Piece(PieceName name, Color color) {
        this.name = name;
        this.color = color;
        this.isKilled = false;
        this.moves = new ArrayList<>();
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(Move move) {
        this.moves.add(move);
    }

    public boolean isFirstMove() {
        return this.moves.isEmpty();
    }
    public PieceName getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    protected boolean isMovingHorizontally(Cell start, Cell end) {
        return start.getVerticalDistance(end) == 0 && start.getHorizontalDistance(end) == 1;
    }

    protected boolean isMovingVertically(Cell start, Cell end) {
        return start.getVerticalDistance(end) == 1 && start.getHorizontalDistance(end) == 0;
    }

    protected boolean isMovingDiagonally(Cell start,Cell end) {
        return start.getVerticalDistance(end) == 1 && start.getHorizontalDistance(end) == 1;
    }
}
