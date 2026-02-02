package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class HorizontalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard chessBoard) {
        //for horizontal movement row number should be same

        if(startCell.getX() != endCell.getX()) return false;
        int step = (endCell.getY()  > startCell.getY() ? 1 : -1);

        int currentColumn = startCell.getY() + step;

        while(currentColumn != endCell.getY() && currentColumn >= 0 && currentColumn < 8) {
            if(chessBoard.getBoard().get(startCell.getX()).get(currentColumn-'a').hasPiece()) return false;
            currentColumn += step;
        }
        return !endCell.hasPiece() || endCell.getChessPiece().get().getColor() != startCell.getChessPiece().get().getColor();
    }
}
