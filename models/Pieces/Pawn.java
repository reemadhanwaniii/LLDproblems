package models.Pieces;

import models.Board.Cell;

public class Pawn implements ChessPiece{


    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }

    @Override
    public boolean isKilled() {
        return false;
    }

    @Override
    public void setKilled(boolean killed) {

    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
