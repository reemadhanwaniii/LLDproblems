package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Helpers.Color;
import models.Helpers.Directions;

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




//      write implementation for positive first in what all cases it move and for rest it returns false

        Directions direction = getMovementDirection(startCell, endCell);

        if(!isValidDirectionForPawn(direction)) {
            throw new InvalidMoveException("Invalid move direction");
        }

        if(isMovingVertically(startCell,endCell) && !endCell.hasPiece()){
            if(isFirstMove() && startCell.getVerticalDistance(endCell) == 2) return true;
            else if(startCell.getVerticalDistance(endCell) == 1) return true;
            else return false;
        }

        if(isMovingDiagonally(startCell,endCell) &&
                endCell.hasPiece() &&
                    this.getColor() != endCell.getChessPiece().get().getColor())
            return true;

        return false;
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }

    private boolean isValidDirectionForPawn(Directions direction) {
        if(this.getColor().equals(Color.WHITE)) {
            return (direction.equals(Directions.FORWARD_Y) ||
                    direction.equals(Directions.DIAGONAL_FORWARD_LEFT)
            || direction.equals(Directions.DIAGONAL_FORWARD_RIGHT));
        } else {
           return (direction.equals(Directions.BACKWARD_Y) ||
                    direction.equals(Directions.DIAGONAL_BACKWARD_LEFT)
            || direction.equals(Directions.DIAGONAL_BACKWARD_RIGHT));

        }
    }
}
