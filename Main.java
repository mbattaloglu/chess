package Chess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	    ChessBoard board = new ChessBoard();
        System.out.println(board);
        Piece piece = null;
        String from = null;
        String to = null;

        while (!board.isGameEnded()){
            System.out.println("It is " + (board.isWhitePlaying() ? "White" : "Black") + "'s turn");
            do {
                System.out.print("Enter the location of piece:");
                from = reader.next();
                System.out.println(board.getSquare(from));
                piece = board.getPieceAt(from);
            }while (piece == null || piece.getColor() != board.playerNumber());

            do {
                System.out.print("Enter new coodinate:");
                to = reader.next();
                System.out.println(board.getSquare(to));
            }while (!piece.canMove(board, board.getSquare(from), board.getSquare(to)));
            piece.move(board,from,to);
            board.changePlayer();
            System.out.println(board);
        }
        reader.close();
    }
}
