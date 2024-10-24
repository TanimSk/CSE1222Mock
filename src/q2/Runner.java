package q2;

public class Runner {
    private static Matrix matrix = new Matrix();

    public static void main(String[] args) {
        matrix.set(0, 0, "Hello");
        matrix.set(0, 1, "I am");
        matrix.set(1, 0, "Tanim,");
        matrix.set(1, 1, "from CSERU.");

        System.out.println(matrix.get(0, 0));
        System.out.println(matrix.get(0, 1));
        System.out.println(matrix.get(1, 0));
        System.out.println(matrix.get(1, 1));

        for (Cell cell : matrix.getDescribedCells()) {
            System.out.println(cell.getRow() + " " + cell.getCol() + " " + cell.getValue());
        }
    }
}
