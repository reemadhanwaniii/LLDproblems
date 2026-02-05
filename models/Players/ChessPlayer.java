package models.Players;

import models.Board.ChessBoard;
import models.Pieces.ChessPiece;
import models.Pieces.Piece;
import models.Pieces.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player {
    private final Map<PieceName, ChessPiece> pieces;
    private final ChessBoard board;

    public ChessPlayer(String name,ChessBoard board,Map<PieceName, ChessPiece> pieces) {
        super(name);
        this.board = board;
        this.pieces = pieces;
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return pieces;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public ChessPiece getPiece(PieceName pieceName) {
        if(pieces.containsKey(pieceName) && pieces.get(pieceName).isKilled()){
            pieces.remove(pieceName); // lazy deletion
        }
        if(!pieces.containsKey(pieceName)) {
            throw new IllegalArgumentException("Piece not found");
        }

        return pieces.get(pieceName);
    }
}
