package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(PieceName name, Color color) {
        super(name, color);
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
