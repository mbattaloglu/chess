package Chess;

public class Pawn extends Piece {

    private String Scolor;
    private int movecount = 0;

    public Pawn(int color){
        super(color);
        if (color==0){
            this.Scolor = "P";
        }
        else if (color==1){
            this.Scolor = "p";
        }
        else {
            this.Scolor = null;
        }
    }

    @Override
    public String getScolor() {
        return Scolor;
    }

    @Override
    public boolean canMove(ChessBoard board, Square initialLocation, Square targetLocation) {
        if (targetLocation.getRow()-initialLocation.getRow()==2 && targetLocation.intColumn()-initialLocation.intColumn()==0 && movecount==0 && this.getColor() == 0 && board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].getPiece()==null && board.getSquares()[targetLocation.getRow()][targetLocation.intColumn()-1].getPiece()==null){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==1 && (targetLocation.intColumn()-initialLocation.intColumn()==0) && this.getColor() == 0 && board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].getPiece()==null){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-2 && targetLocation.intColumn()-initialLocation.intColumn() ==0 && this.getColor()==1 && board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].getPiece()==null && board.getSquares()[targetLocation.getRow()][targetLocation.intColumn()-1].getPiece()==null){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-1 && targetLocation.intColumn()-initialLocation.intColumn() ==0 && this.getColor()==1 && board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].getPiece()==null){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==1 && (targetLocation.intColumn()-initialLocation.intColumn()==1 || targetLocation.intColumn()-initialLocation.intColumn()==-1) && board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].getPiece()!=null && this.getColor() == 0){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-1 && (targetLocation.intColumn()-initialLocation.intColumn()==-1 || targetLocation.intColumn()-initialLocation.intColumn()==1) && board.getSquares()[targetLocation.getRow()][targetLocation.intColumn()].getPiece()!=null && this.getColor() == 1){
            return true;
        }
        else {
            System.out.println("Invalid Move, Try Again...");
            return false;
        }
    }

    @Override
    public void move(ChessBoard board,String from, String to){
        Square targetLocation = board.getSquare(to);
        Square initialLocation = board.getSquare(from);
        if (this.canMove(board, initialLocation,targetLocation)){
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setPiece(this);
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setSpiece(this.Scolor);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setPiece(null);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setSpiece(null);
            movecount++;
        }
    }
}

