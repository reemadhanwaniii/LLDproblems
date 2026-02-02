package models.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Pawn;

public class PawnVerticalMovementStrategy implements  MovementStrategy {

    private final Pawn pawn;

    public PawnVerticalMovementStrategy(Pawn pawn) {
        this.pawn = pawn;
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        if(startCell.getY() != endCell.getY()) { return false; }

        int step = this.pawn.getColor().equals(Color.WHITE) ? 1 : -1;
        int displacement = endCell.getX() - startCell.getX();

        if(this.pawn.isFirstMove() && displacement == 2*step) {
            return !endCell.hasPiece() || !board.getBoard().get(startCell.getX() + step).get(startCell.getY()-'a').hasPiece();
        }

        return (displacement == step) && !endCell.hasPiece();
    }
}
