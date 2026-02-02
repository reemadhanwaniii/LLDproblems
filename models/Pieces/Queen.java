package models.Pieces;

import exceptions.InvalidMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Strategy.DiagonalMovementStrategy;
import models.Strategy.HorizontalMovementStrategy;
import models.Strategy.KingMovementStrategy;
import models.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class Queen extends Piece implements ChessPiece {

    public Queen(PieceName name, Color pieceColor, String color) {
        super(name, pieceColor, color);
        this.strategies = Arrays.asList(new VerticalMovementStrategy(),new HorizontalMovementStrategy(),new DiagonalMovementStrategy());
    }

    @Override
    public void makeMove(Cell startCell, Cell endCell) {

    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell, ChessBoard board) {
        if(super.canMove(startCell, endCell, board)){
            return true;
        }
        throw new InvalidMoveException("Invalid Queen move");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
