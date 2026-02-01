package models.Strategy;

import models.Board.Cell;

public interface MovementStrategy {
    boolean canMove(Cell starrCell,Cell endCell);
}
