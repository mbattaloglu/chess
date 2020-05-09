package Chess;

public class Piece {
    private int movecount = 0;
    private int color;
    private String Scolor;

    public Piece(int color){
        this.color = color;
        if(color == 0){
            this.Scolor = "W";
        }
        else if (color == 1){
            this.Scolor = "B";
        }
        else {
            this.Scolor = null;
        }
    }

    public String getScolor() {
        return Scolor;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public boolean canMove(ChessBoard board, Square initialLocation,Square targetLocation){
        //This method for just overriding other piece's canMove() method
        if (targetLocation.getRow()-initialLocation.getRow()<=2){
            return true;
        }
        System.out.println("Invalid Move, Try Again...");
        return false;
    }

    public void move(ChessBoard board,String from, String to){
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
