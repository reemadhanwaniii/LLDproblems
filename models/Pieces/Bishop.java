package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Strategy.DiagonalMovementStrategy;
import models.Strategy.KingMovementStrategy;

import java.util.Arrays;

public class Bishop extends Piece implements ChessPiece {
    public Bishop(PieceName pieceName, Color pieceColor,String pieceSymbol) {
        super(pieceName, pieceColor, pieceSymbol);
        this.strategies = Arrays.asList(new DiagonalMovementStrategy());
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell,ChessBoard board) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        if(super.canMove(startCell, endCell,board)) {
            return true;
        }
        throw new InvalidMoveException("Invalid Bishop move");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
