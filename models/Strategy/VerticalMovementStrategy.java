package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class VerticalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {

        if(startCell.getY() != endCell.getY()) return false;
        int step = (endCell.getX()  > startCell.getX() ? 1 : -1);

        int currentRow = startCell.getX() + step;

        while(currentRow != endCell.getX() && currentRow >= 0 && currentRow < 8) {
            if(board.getBoard().get(currentRow).get(startCell.getY() - 'a').hasPiece()) return false;
            currentRow += step;
        }
        return !endCell.hasPiece() || endCell.getChessPiece().get().getColor() != startCell.getChessPiece().get().getColor();
    }
}
