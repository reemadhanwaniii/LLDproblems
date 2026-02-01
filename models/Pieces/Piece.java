package models.Pieces;

import models.Helpers.Color;

public abstract class Piece {
    private final PieceName name;
    private final Color color;
    private boolean isKilled;

    public Piece(PieceName name, Color color) {
        this.name = name;
        this.color = color;
        this.isKilled = false;
    }


    public PieceName getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }
}
