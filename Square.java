package Chess;

public class Square {

    private int row;
    private String column;
    private Piece piece;
    private String spiece;

    public Square(int row, String column, Piece piece){
        this.row = row;
        this.column = column;
        this.piece = piece;
        if (piece==null){
            this.spiece = null;
        }
        else {
            this.spiece = piece.getScolor();
        }
    }

    public void putNewQueen(){
        Queen queen = null;
        if (row == 7){
            queen = new Queen(1);
        }
        else if (row == 0){
            queen = new Queen(0);
        }
        this.setPiece(queen);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int intColumn(){
        if (this.column == "A"){
            return 1;
        }
        else if (this.column== "B"){
            return 2;
        }
        else if (this.column == "C"){
            return 3;
        }
        else if(this.column == "D"){
            return 4;
        }
        else if (this.column == "E"){
            return 5;
        }
        else if (this.column == "F"){
            return 6;
        }
        else if (this.column == "G"){
            return 7;
        }
        else if (this.column == "H"){
            return 8;
        }
        return 0;
    }

    public String getSpiece() {
        if (spiece == null){
            return " ";
        }
        return spiece;
    }

    public void setSpiece(String spiece) {
        this.spiece = spiece;
    }

    public boolean isAtLastRow(Piece piece){
        if (this.row == 1 && piece.getColor() == 1){
            return true;
        }
        else if(this.row == 8 && piece.getColor() == 0){
            return true;
        }
        return false;
    }

    public boolean isEmpty(Square s){
        if (s.getPiece()==null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Square{" +
                "row=" + row +
                ", column='" + column + '\'' +
                ", piece=" + piece +
                ", spiece='" + spiece + '\'' +
                '}';
    }
}
