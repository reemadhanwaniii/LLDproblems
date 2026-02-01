package models.Strategy;

import models.Board.Cell;

public class DiagonalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell starrCell, Cell endCell) {
        return false;
    }
}
