package Chess;

import java.util.ArrayList;

public class ChessBoard {
    boolean whitePlaying = true;

    public boolean isWhitePlaying() {
        return whitePlaying;
    }

    public ChessBoard returnBoard(Square x){
        return this;
    }

    public boolean isGameEnded(){
        ArrayList<Piece> piecesRemaining = new ArrayList<Piece>();
        for(int row = 0;row<8;row++){
            for (int col = 0;col<8;col++){
                Square notEmpty = squares[row][col];
                if (squares[row][col].getPiece() != null){
                    piecesRemaining.add(notEmpty.getPiece());
                }
            }
        }
        return true;
    }
    public int playerNumber(){
        if(whitePlaying){
            return 0;
        }
        return 1;
    }
    public void changePlayer(){
        if (whitePlaying){
            whitePlaying = false;
        }
        else {
            whitePlaying = true;
        }
    }
    public Square getSquare(String location){
        char[] elements = location.toCharArray();
        String srow= String.valueOf(elements[1]);
        int row = Integer.parseInt(srow);

        if(elements[0] == 'a'){
            return getSquares()[row-1][0];
        }
        else if (elements[0] == 'b'){
            return getSquares()[row-1][1];
        }
        else if (elements[0] == 'c'){
            return getSquares()[row-1][2];
        }
        else if (elements[0] == 'd'){
            return getSquares()[row-1][3];
        }
        else if (elements[0] == 'e'){
            return getSquares()[row-1][4];
        }
        else if (elements[0] == 'f'){
            return getSquares()[row-1][5];
        }
        else if (elements[0] == 'g'){
            return getSquares()[row-1][6];
        }
        else if (elements[0] == 'h'){
            return getSquares()[row-1][7];
        }
        return null;
    }


    public Square[][] getSquares(){
        return squares;
    }

    public Piece getPieceAt(String from){
        char[] elements = from.toCharArray();
        String srow = String.valueOf(elements[1]);
        int row = Integer.parseInt(srow);

        if (elements[0] == 'a'){
            return getSquares()[row-1][0].getPiece();
        }
        else if (elements[0] == 'b'){
            return squares[row-1][1].getPiece();
        }
        else if (elements[0] == 'c'){
            return squares[row-1][2].getPiece();
        }
        else if (elements[0] == 'd'){
            return squares[row-1][3].getPiece();
        }
        else if (elements[0] == 'e'){
            return squares[row-1][4].getPiece();
        }
        else if (elements[0] == 'f'){
            return squares[row-1][5].getPiece();
        }
        else if (elements[0] == 'g'){
            return squares[row-1][6].getPiece();
        }
        else if (elements[0] == 'h'){
            return squares[row-1][7].getPiece();
        }
        return null;
    }


    Rook r1 = new Rook(0);
    Rook r2 = new Rook(0);
    Rook r3 = new Rook(1);
    Rook r4 = new Rook(1);

    Knight n1 = new Knight(0);
    Knight n2 = new Knight(0);
    Knight n3 = new Knight(1);
    Knight n4 = new Knight(1);

    Bishop b1 = new Bishop(0);
    Bishop b2 = new Bishop(0);
    Bishop b3 = new Bishop(1);
    Bishop b4 = new Bishop(1);

    King k1 = new King(0);
    King k2 = new King(1);

    Queen q1 = new Queen(0);
    Queen q2 = new Queen(1);


    Pawn pW1 = new Pawn(0);
    Pawn pW2 = new Pawn(0);
    Pawn pW3 = new Pawn(0);
    Pawn pW4 = new Pawn(0);
    Pawn pW5 = new Pawn(0);
    Pawn pW6 = new Pawn(0);
    Pawn pW7 = new Pawn(0);
    Pawn pW8 = new Pawn(0);

    Pawn pB1 = new Pawn(1);
    Pawn pB2 = new Pawn(1);
    Pawn pB3 = new Pawn(1);
    Pawn pB4 = new Pawn(1);
    Pawn pB5 = new Pawn(1);
    Pawn pB6 = new Pawn(1);
    Pawn pB7 = new Pawn(1);
    Pawn pB8 = new Pawn(1);


    Square A8 = new Square(8,"A",r3);
    Square B8 = new Square(8,"B",n3);
    Square C8 = new Square(8,"C",b3);
    Square D8 = new Square(8,"D",q2);
    Square E8 = new Square(8,"E",k2);
    Square F8 = new Square(8,"F",b4);
    Square G8 = new Square(8,"G",n4);
    Square H8 = new Square(8,"H",r4);
    Square A7 = new Square(7,"A",pB1);
    Square B7 = new Square(7,"B",pB2);
    Square C7 = new Square(7,"C",pB3);
    Square D7 = new Square(7,"D",pB4);
    Square E7 = new Square(7,"E",pB5);
    Square F7 = new Square(7,"F",pB6);
    Square G7 = new Square(7,"G",pB7);
    Square H7 = new Square(7,"H",pB8);
    Square A6 = new Square(6,"A",null);
    Square B6 = new Square(6,"B",null);
    Square C6 = new Square(6,"C",null);
    Square D6 = new Square(6,"D",null);
    Square E6 = new Square(6,"E",null);
    Square F6 = new Square(6,"F",null);
    Square G6 = new Square(6,"G",null);
    Square H6 = new Square(6,"H",null);
    Square A5 = new Square(5,"A",null);
    Square B5 = new Square(5,"B",null);
    Square C5 = new Square(5,"C",null);
    Square D5 = new Square(5,"D",null);
    Square E5 = new Square(5,"E",null);
    Square F5 = new Square(5,"F",null);
    Square G5 = new Square(5,"G",null);
    Square H5 = new Square(5,"H",null);
    Square A4 = new Square(4,"A",null);
    Square B4 = new Square(4,"B",null);
    Square C4 = new Square(4,"C",null);
    Square D4 = new Square(4,"D",null);
    Square E4 = new Square(4,"E",null);
    Square F4 = new Square(4,"F",null);
    Square G4 = new Square(4,"G",null);
    Square H4 = new Square(4,"H",null);
    Square A3 = new Square(3,"A",null);
    Square B3 = new Square(3,"B",null);
    Square C3 = new Square(3,"C",null);
    Square D3 = new Square(3,"D",null);
    Square E3 = new Square(3,"E",null);
    Square F3 = new Square(3,"F",null);
    Square G3 = new Square(3,"G",null);
    Square H3 = new Square(3,"H",null);
    Square A2 = new Square(2,"A",pW1);
    Square B2 = new Square(2,"B",pW2);
    Square C2 = new Square(2,"C",pW3);
    Square D2 = new Square(2,"D",pW4);
    Square E2 = new Square(2,"E",pW5);
    Square F2 = new Square(2,"F",pW6);
    Square G2 = new Square(2,"G",pW7);
    Square H2 = new Square(2,"H",pW8);
    Square A1 = new Square(1,"A",r1);
    Square B1 = new Square(1,"B",n1);
    Square C1 = new Square(1,"C",b1);
    Square D1 = new Square(1,"D",q1);
    Square E1 = new Square(1,"E",k1);
    Square F1 = new Square(1,"F",b2);
    Square G1 = new Square(1,"G",n2);
    Square H1 = new Square(1,"H",r2);

    private Square[][] squares = {{A1,B1,C1,D1,E1,F1,G1,H1},{A2,B2,C2,D2,E2,F2,G2,H2},{A3,B3,C3,D3,E3,F3,G3,H3},{A4,B4,C4,D4,E4,F4,G4,H4},{A5,B5,C5,D5,E5,F5,G5,H5},{A6,B6,C6,D6,E6,F6,G6,H6},{A7,B7,C7,D7,E7,F7,G7,H7},{A8,B8,C8,D8,E8,F8,G8,H8}};
    public String toString() {
        System.out.println("    A   B   C   D   E   F   G   H ");
        System.out.println("   ---------------------------------");

        for (int row = 7;row>=0;row--){
            System.out.print((row+1)+" ");
            for (int col = 0;col<8;col++){
                System.out.print("| "+squares[row][col].getSpiece()+" ");
                if (col==7){
                    System.out.println("| "+(row+1));
                    System.out.println("   ---------------------------------");
                }
            }
        }
        System.out.println("    A   B   C   D   E   F   G   H ");
        return "\n";
    }
}
