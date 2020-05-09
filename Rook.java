package Chess;

public class Rook extends Piece{

    private String Scolor;

    public Rook(int color){
        super(color);
        if (color==0){
            this.Scolor = "R";
        }
        else if (color==1){
            this.Scolor = "r";
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

        int rowdistance = (targetLocation.getRow()-1)-(initialLocation.getRow()-1);
        int coldistance = (targetLocation.intColumn()-1)-(initialLocation.intColumn()-1);

        if (( ((targetLocation.getRow()-initialLocation.getRow())<=8) && (targetLocation.intColumn()-initialLocation.intColumn())==0)){
            for (int i=0;i<rowdistance; i++){
                if (board.getSquares()[initialLocation.getRow()+i][initialLocation.intColumn()-1].getPiece()!=null){
                    System.out.println("Invalid Move, Try Again...");
                    return false;
                }
            }
        }
        else if (-8<=targetLocation.getRow()-initialLocation.getRow() && targetLocation.intColumn()-initialLocation.intColumn()==0){
            for (int i=rowdistance;i>0;i--){
                if (board.getSquares()[initialLocation.getRow()-i][initialLocation.intColumn()-1].getPiece()!=null){
                    System.out.println("Invalid Move, Try Again...");
                    return false;
                }
            }
        }
        else if ((targetLocation.getRow()-initialLocation.getRow())==0 && (targetLocation.intColumn()-initialLocation.intColumn()<=8)){
            for (int i=0;i<coldistance;i++){
                if (board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()+i].getPiece()!=null){
                    System.out.println("Invalid Move, Try Again...");
                    return false;
                }
            }
        }
        else if (targetLocation.getRow()-initialLocation.getRow()==0 && (-8<=targetLocation.intColumn()-initialLocation.intColumn())){
            for (int i=coldistance;i>0;i--){
                if (board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-i].getPiece()!=null){
                    System.out.println("Invalid Move, Try Again...");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void move(ChessBoard board,String from, String to) {
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
