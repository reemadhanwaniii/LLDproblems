package game;

import models.Board.Board;
import models.Pieces.Move;
import models.Players.Player;

import javax.swing.text.PlainDocument;
import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board,Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame(){
        while(true) {
            Player current = players.poll();

            Move move = current.makeMove();
            this.board.applyMove(move);

            if(isGameOver()) {
                System.out.println("Game Over");
                System.out.println(current.getName() + "wins");
            }

            players.add(current);
        }
    }
    protected abstract boolean isGameOver();
}
