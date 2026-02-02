package game;

import models.Board.Board;
import models.Board.ChessBoard;

public class ChessGame extends BoardGame{
    public ChessGame(ChessBoard board) {
        super(board);
        BoardFactory.prepareBoardByPlacingPieces(board);
    }

    @Override
    protected boolean isGameOver() {
        return false;
    }
}
