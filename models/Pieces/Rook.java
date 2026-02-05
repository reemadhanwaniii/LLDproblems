package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Strategy.DiagonalMovementStrategy;
import models.Strategy.HorizontalMovementStrategy;
import models.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class Rook extends Piece implements ChessPiece{
    public Rook(PieceName name, Color color, String pieceSymbol) {
        super(name,color,pieceSymbol);
        this.strategies = Arrays.asList(new VerticalMovementStrategy(),new HorizontalMovementStrategy());
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell,ChessBoard board) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        if(super.canMove(startCell,endCell,board)){
            return true;
        }
        throw new InvalidMoveException("Invalid Rook move");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
