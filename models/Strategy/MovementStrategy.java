package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public interface MovementStrategy {
    boolean canMove(Cell starrCell, Cell endCell, ChessBoard board);
}
