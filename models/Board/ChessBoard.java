package models.Board;

import models.Pieces.ChessPiece;
import models.Pieces.Move;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board {

    private static final int rc = 8;
    private static final int cc = 8;
    private final List<List<Cell>> board;

    public ChessBoard() {
        this.board = new ArrayList<>();
        for(int i=0;i<rc;i++) {
            List<Cell> row = new ArrayList<>();
            for(int j=0;j<cc;j++) {
                Cell cell = new Cell(i,(char)(j+'a'));
                row.add(cell);
            }
            board.add(row);
        }
    }

    @Override
    public void display() {
        for(int i=0;i<rc;i++) {
            for(int j=0;j<cc;j++) {
                if(board.get(i).get(j).hasPiece()) {
                    System.out.print(board.get(i).get(j).getChessPiece().get().getPieceSymbol()+"|");
                }else{
                    System.out.print("___|");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void applyMove(Move move) {

    }

    @Override
    public void setPiece(ChessPiece piece, int row, char col) {
        board.get(row).get(col-'a').setChessPiece(piece);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
