package Chess;

import java.util.SplittableRandom;

public class Queen extends Piece {

    private String Scolor;

    public Queen(int color) {
        super(color);
        if (color == 0) {
            this.Scolor = "Q";
        } else if (color == 1) {
            this.Scolor = "q";
        } else {
            this.Scolor = null;
        }
    }

    @Override
    public String getScolor() {
        return Scolor;
    }

    @Override
    public boolean canMove(ChessBoard board, Square initialLocation, Square targetLocation) {
        if (this.getColor() == 0) {
            if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == 0 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == 0 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 0 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 0 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 1)) {
                return true;
            }
        }
        else if (this.getColor() == 1) {
            if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == 0 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == 0 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == -1 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 0 && targetLocation.intColumn() - initialLocation.intColumn() == 1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 0 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            } else if (targetLocation.getRow() - initialLocation.getRow() == 1 && targetLocation.intColumn() - initialLocation.intColumn() == -1 && (board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece() == null || board.getSquares()[targetLocation.getRow() - 1][targetLocation.intColumn() - 1].getPiece().getColor() == 0)) {
                return true;
            }
        }
        System.out.println("Invalid Move, Try Again...");
        return false;
    }

    @Override
    public void move(ChessBoard board, String from, String to) {
        Square targetLocation = board.getSquare(to);
        Square initialLocation = board.getSquare(from);
        if (this.canMove(board, initialLocation,targetLocation)){
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setPiece(this);
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setSpiece(this.Scolor);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setPiece(null);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setSpiece(null);
        }
    }
}

