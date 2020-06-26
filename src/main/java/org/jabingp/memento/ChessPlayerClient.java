package org.jabingp.memento;

public class ChessPlayerClient {
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {
        Chessman chess = new Chessman("车", 1, 1);

        ChessPlayerClient.play(chess);

        chess.setY(4);

        ChessPlayerClient.play(chess);

        chess.setX(5);

        ChessPlayerClient.play(chess);

        ChessPlayerClient.undo(chess);
        ChessPlayerClient.undo(chess);

        ChessPlayerClient.redo(chess);
        ChessPlayerClient.redo(chess);
    }

    public static void play(Chessman chess) {
        mc.setMemento(chess.save());
        ChessPlayerClient.index++;
        ChessPlayerClient.showChess(chess);
    }

    public static void undo(Chessman chess) {
        System.out.println("******悔棋******");
        ChessPlayerClient.index--;
        chess.restore(mc.getMemento(ChessPlayerClient.index));
        ChessPlayerClient.showChess(chess);
    }

    public static void redo(Chessman chess) {
        System.out.println("******撤销悔棋******");
        ChessPlayerClient.index++;
        chess.restore(mc.getMemento(ChessPlayerClient.index));
        ChessPlayerClient.showChess(chess);
    }

    public static void showChess(Chessman chess) {
        System.out.printf("棋子%s当前位置为：第%d第%d列。\n", chess.getLabel(), chess.getX(), chess.getY());
    }
}