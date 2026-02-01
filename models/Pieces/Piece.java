package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;
import models.Helpers.Directions;

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

    protected Directions getMovementDirection(Cell start, Cell end) {
//        finds direction in which cell are moving according to diff between start and end cell
        int x = end.getX() - start.getX();
        int y = end.getY() - start.getY();

//        improvement for diagonal conditions

        if(x == 0 && y == 0) {
            return Directions.NONE;
        }
        if(x == 0){
            return (y > 0) ? Directions.FORWARD_Y : Directions.BACKWARD_Y;
        }
        if(y == 0){
            return (x > 0) ? Directions.FORWARD_X : Directions.BACKWARD_X;
        }
        if(x == 1 && y == 1) {
            return Directions.DIAGONAL_FORWARD_RIGHT;
        }
        if(x == 1 && y == -1) {
            return Directions.DIAGONAL_BACKWARD_RIGHT;
        }
        if(x == -1 && y == 1) {
            return Directions.DIAGONAL_FORWARD_LEFT;
        }
        if(x == -1 && y == -1) {
            return Directions.DIAGONAL_BACKWARD_LEFT;
        }

        return Directions.NONE;
    }
}


