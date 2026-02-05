package models.Players;

import game.BoardFactory;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.PieceName;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    public static Player createPlayer(String name, Color color, ChessBoard chessBoard){
        Map<PieceName, ChessPiece> pieces = (color.equals(Color.BLACK) ? BoardFactory.getBlackPieces() : BoardFactory.getWhitePieces());
        return new HumanChessPlayer(name,chessBoard,pieces);
    }
}
