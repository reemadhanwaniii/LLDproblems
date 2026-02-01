package models.Board;

import models.Helpers.Pair;
import models.Pieces.ChessPiece;

import java.util.Optional;

public class Cell {
  private Optional<ChessPiece> chessPiece;
  private final Pair position;

  public Cell(int x,char y) {
    this.position = new Pair(x,y);
    this.chessPiece = Optional.empty();
  }

   public Optional<ChessPiece> getChessPiece() {
      return chessPiece;
   }

   public void setChessPiece(ChessPiece chessPiece) {
      this.chessPiece = Optional.of(chessPiece);
   }

   public Pair getPosition() {
      return position;
   }

   public int getX(){
      return this.position.getX();
   }

   public char getY() {
      return this.position.getY();
   }

   public void removePiece() {
      this.chessPiece = Optional.empty();
   }

   public boolean hasPiece() {
      return chessPiece.isPresent();
   }
}
