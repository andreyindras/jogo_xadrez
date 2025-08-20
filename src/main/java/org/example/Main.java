package org.example;

import org.example.chess.ChessMatch;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("source: ");
            ChessPosition source = UI.readChessposition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessposition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}