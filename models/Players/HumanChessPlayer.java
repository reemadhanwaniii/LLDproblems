package models.Players;

import models.Board.ChessBoard;
import models.Pieces.ChessPiece;
import models.Pieces.Move;
import models.Pieces.PieceName;

import java.util.Map;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer {
    public HumanChessPlayer(String name, ChessBoard board, Map<PieceName, ChessPiece> pieces) {
        super(name,board,pieces);
    }

    @Override
    public Move makeMove() {
        // 1. Display the current state of the board

        this.getBoard().display();

        // 2. prepare the scanner for taking input
        Scanner sc = new Scanner(System.in);

        // 3. Take the input of which cell user wants to select and then move piece from that cell
        System.out.println("Please enter the coordinates of the piece you would like to move:");
        int row = sc.nextInt();
        char col = sc.next().charAt(0);


        // 4. Check if there is any piece present or not ?
        if(!this.getBoard().getBoard().get(row).get(col-'a').hasPiece()) {
            throw new RuntimeException("no Piece found at this location");
        }

        // 5. Take input for destination
        System.out.println("Please enter the coordinates where you would like to move your piece");
        int desRow = sc.nextInt();
        char desCol = sc.next().charAt(0);


        // 6. check if we can move or not ?

        ChessPiece pieceToMove = this.getBoard().getBoard().get(row).get(col-'a').getChessPiece().get();
        if(!pieceToMove.canMove(this.getBoard().getBoard().get(row).get(col-'a'),this.getBoard().getBoard().get(desRow).get(desCol-'a'),this.getBoard())) {
            throw new RuntimeException("piece can not be moved");
        }
        return new Move(this.getBoard().getBoard().get(row).get(col-'a'),this.getBoard().getBoard().get(desRow).get(desCol-'a'));

    }
}
