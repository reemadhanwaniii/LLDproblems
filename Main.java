import game.BoardGame;
import game.ChessGame;
import game.GameFactory;


public class Main {
    static void main(String[] args) throws Exception{


        ChessGame game = GameFactory.createGame();
        game.startGame();

    }

}
