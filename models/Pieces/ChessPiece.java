package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

public interface ChessPiece {
    void makeMove(Cell startCell,Cell endCell);
    boolean canMove(Cell startCell,Cell endCell);
    boolean isKilled();
    void setKilled(boolean killed);
    void listPossibleMoves(Cell currentCell);  //here we willdo sout because it is consle application we will display these are possible moves
    boolean isFirstMove();
    Color getColor();
}
