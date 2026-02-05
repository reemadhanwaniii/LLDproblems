import game.BoardGame;
import game.ChessGame;
import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Players.ChessPlayer;
import models.Players.Player;
import models.Players.PlayerFactory;

public class Main {
    static void main(String[] args) throws Exception{

        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer p1 = PlayerFactory.createPlayer("Alice", Color.BLACK,chessBoard);
        ChessPlayer p2 = PlayerFactory.createPlayer("Bob", Color.BLACK,chessBoard);

        BoardGame game = new ChessGame(chessBoard,p1,p2);
        game.startGame();

    }

}
