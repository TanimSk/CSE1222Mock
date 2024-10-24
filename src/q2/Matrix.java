package q2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Matrix {
    private ArrayList<Cell> Cell = new ArrayList<Cell>();

    public void set(int row, int column, String description) {
        Cell.add(new Cell(row, column, description));
    }

    public String get(int row, int column) {
        for (Cell g : Cell) {
            if (g.getRow() == row && g.getCol() == column) {
                return g.getValue();
            }
        }
        return null;
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        for (Cell g : Cell) {
            if (g.getValue() != null) {
                cells.add(new Cell(g.getRow(), g.getCol(), g.getValue()));
            }
        }
        return cells;
    }
}
