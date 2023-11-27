package TreasureHunt;
public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // SETTERS
    public void setRow(int row) {
        this.row = row;
    }
    public void setCol(int col) {
        this.col = col;
    }

    // GETTERS
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    // METHODS
    public boolean equals(Object position) {
        Position p = (Position)position;
        if (this.row == p.row && this.col == p.col) {
            return true;
        }
        return false;
    }

}
