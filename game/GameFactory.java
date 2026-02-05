package game;

import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Players.ChessPlayer;
import models.Players.PlayerFactory;

public class GameFactory {
    public static ChessGame createGame() {
        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer p1 = PlayerFactory.createPlayer("Alice", Color.BLACK,chessBoard);
        ChessPlayer p2 = PlayerFactory.createPlayer("Bob", Color.BLACK,chessBoard);

        return new ChessGame(chessBoard,p1,p2);
    }
}
