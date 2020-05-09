package Chess;

public class Knight extends Piece{
    private int movecount = 0;
    private String Scolor;

    public Knight(int color){
        super(color);
        if (color==0){
            this.Scolor = "N";
        }
        else if (color==1){
            this.Scolor = "n";
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
        if (targetLocation.getRow()-initialLocation.getRow() ==2 && targetLocation.intColumn()-initialLocation.intColumn() == 1){
                return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==2 && targetLocation.intColumn()-initialLocation.intColumn()==-1){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-2 && targetLocation.intColumn()-initialLocation.intColumn()==-1){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-2 && targetLocation.intColumn()-initialLocation.intColumn()==1){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==1 && targetLocation.intColumn()-initialLocation.intColumn()==2){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==1 && targetLocation.intColumn()-initialLocation.intColumn()==-2){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-1 && targetLocation.intColumn()-initialLocation.intColumn()==2){
            return true;
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==-1 && targetLocation.intColumn()-initialLocation.intColumn()==-2){
            return true;
        }
        else {
            System.out.println("Invalid Move, Try Again...");
            return false;
        }
    }

    @Override
    public void move(ChessBoard board, String from,String to) {
        Square targetLocation = board.getSquare(to);
        Square initialLocation = board.getSquare(from);
        if (this.canMove(board, initialLocation,targetLocation)){
            System.out.println("third canmove true");
            System.out.println("TARGET:"+targetLocation);
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setPiece(this);
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setSpiece(this.Scolor);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setPiece(null);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setSpiece(null);
            System.out.println("target Location:"+ board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1]);
            System.out.println("initial location"+board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1]);
        }
    }
}
