package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class DiagonalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        return Math.abs(startCell.getY() - endCell.getY()) == Math.abs(startCell.getX() - endCell.getX());
    }
}


//some strategies have dummy implementation improve it later