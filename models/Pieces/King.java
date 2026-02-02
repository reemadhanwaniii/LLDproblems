package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Helpers.Color;
import models.Strategy.KingMovementStrategy;

import java.util.Arrays;

public class King extends Piece implements ChessPiece{
    public King(PieceName pieceName, Color pieceColor, String color) {
        super(pieceName, pieceColor, color);
        this.strategies = Arrays.asList(new KingMovementStrategy());
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        if(super.canMove(startCell, endCell)){
            return true;
        }

        throw new InvalidMoveException("Invalid King move");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
