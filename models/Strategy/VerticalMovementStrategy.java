package models.Strategy;

import models.Board.Cell;

public class VerticalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell starrCell, Cell endCell) {
        return false;
    }
}
