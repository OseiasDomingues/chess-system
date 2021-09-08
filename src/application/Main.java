package application;

import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        //Start a chess game
        ChessMatch chessMatch = new ChessMatch();

        //Start a chess game - User Interface
        UI.printBoard(chessMatch.getPieces());

    }
}
