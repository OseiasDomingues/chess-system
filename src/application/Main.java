package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        //Partida de Xadrez
        ChessMatch chessMatch = new ChessMatch();

        //User Interface
        UI.printBoard(chessMatch.getPieces());

    }
}
