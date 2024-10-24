package q2;

public class Cell {
    private int row;
    private int col;
    private String description;

    Cell(int row, int col, String description) {
        this.row = row;
        this.col = col;
        this.description = description;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getValue() {
        return description;
    }

}
