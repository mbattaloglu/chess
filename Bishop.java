package Chess;

public class Bishop extends Piece{

    private String Scolor;

    public Bishop(int color){
        super(color);
        if (color==0){
            this.Scolor = "B";
        }
        else if (color==1){
            this.Scolor = "b";
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
        //rowdistance and coldistance are equal.
        int rowdistance = (targetLocation.getRow()-1-initialLocation.getRow()-1);
        int coldistance = (targetLocation.intColumn()-1-initialLocation.intColumn()-1);

        if (targetLocation.getRow()-initialLocation.getRow()==targetLocation.intColumn()-initialLocation.intColumn()){
            for (int i=0;i<rowdistance;i++){
                if (board.getSquares()[initialLocation.getRow()+i][initialLocation.intColumn()+i].getPiece()!=null){
                    System.out.println("Invalid Move, Try Again...");
                    return false;
                }
            }
        }
        else if ((targetLocation.getRow()-initialLocation.getRow())+(targetLocation.intColumn()-initialLocation.intColumn())==0){
            if (targetLocation.intColumn()-initialLocation.intColumn()<0){
                int count = 0;
                for (int i=rowdistance;i>0;i--){
                    if (board.getSquares()[initialLocation.getRow()+count][initialLocation.intColumn()-i].getPiece()!=null){
                        System.out.println("Invalid Move, Try Again...");
                        return false;
                    }
                    else{
                        count++;
                    }
                }
            }
            else if (targetLocation.intColumn()-initialLocation.intColumn()>0){
                int count = rowdistance;
                for (int i=0;i<rowdistance;i++){
                    if (board.getSquares()[initialLocation.getRow()+i][initialLocation.intColumn()-count].getPiece()!=null){
                        System.out.println("Invalid Move, Try Again...");
                        return false;
                    }
                    else{
                        count++;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public void move(ChessBoard board,String from, String to) {
        Square targetLocation = board.getSquare(to);
        Square initialLocation = board.getSquare(from);
        if (this.canMove(board,initialLocation,targetLocation)){
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setPiece(this);
            board.getSquares()[targetLocation.getRow()-1][targetLocation.intColumn()-1].setSpiece(this.Scolor);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setPiece(null);
            board.getSquares()[initialLocation.getRow()-1][initialLocation.intColumn()-1].setSpiece(null);

        }
    }
}
