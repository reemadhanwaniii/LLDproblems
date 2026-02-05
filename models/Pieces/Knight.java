package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Strategy.KingMovementStrategy;

import java.util.Arrays;

public class Knight extends Piece implements ChessPiece{
    public Knight(PieceName pieceName, Color pieceColor, String color) {
        super(pieceName, pieceColor, color);
        this.strategies = Arrays.asList(new KingMovementStrategy());
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell,ChessBoard board) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        if(super.canMove(startCell,endCell,board)){
            return true;
        }
        throw new InvalidMoveException("Invalid Knight Move");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
