package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class KingMovementStrategy implements MovementStrategy{
    @Override
    public boolean canMove(Cell starrCell, Cell endCell, ChessBoard board) {
        return false;
    }
}
