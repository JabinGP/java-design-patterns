package org.jabingp.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoCaretaker {
    private List<ChessmanMemento> memento;

    public MementoCaretaker() {
        this.memento = new ArrayList<ChessmanMemento>();
    }

    public ChessmanMemento getMemento(int index) {
        if (index >= 0 && index < this.memento.size()) {
            return this.memento.get(index);
        }
        return null;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento.add(memento);
    }
}