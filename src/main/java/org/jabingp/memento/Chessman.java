package org.jabingp.memento;

public class Chessman extends Chess {

    public Chessman(String label, int x, int y) {
        super(label, x, y);
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(this.getLabel(), this.getX(), this.getY());
    }

    public void restore(ChessmanMemento memento) {
        this.setLabel(memento.getLabel());
        this.setX(memento.getX());
        this.setY(memento.getY());
    }
}
