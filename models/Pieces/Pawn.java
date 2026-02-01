package models.Pieces;

import exceptions.InvalidMoveException;
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
        /**
         *   1. If this is the first move then pawn can move one step or two step
         *   2. If this is not the first move then pawn can move only one step
         *   3. If diagonally we have an opposite color piece then pawn can move and kill that piece
         *   4. If diagonally we have an same color piece then pawn can't move
         *   5. If vertically we have a piece then pawn can't move
         *   6. If we have a black pawn then it can move in the negative direction of y-axis and if we have a white pawn
         *   then it can move in the positive direction of y-axis
         */

        if(startCell.getVerticalDistance(endCell) > 2) {
            throw new InvalidMoveException("Invalid Pawn move");
        }
        if(!isFirstMove() && startCell.getVerticalDistance(endCell) == 2) {
            throw new InvalidMoveException("Invalid Pawn move");
        }
        if(endCell.hasPiece() && !isMovingDiagonally(startCell,endCell)) {
            throw new InvalidMoveException("Invalid Pawn move");
        }
        if(isMovingHorizontally(startCell,endCell)) {
            throw new  InvalidMoveException("Invalid Pawn move");
        }
        return false;
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
