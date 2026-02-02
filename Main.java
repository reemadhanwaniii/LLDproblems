import game.BoardGame;
import game.ChessGame;
import models.Board.Board;
import models.Board.ChessBoard;

public class Main {
    static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        BoardGame game = new ChessGame(board);
        board.display();
    }

}
