import java.util.List;

public class MatrixPrinter {

    public void printResult(double[][] result) {
        System.out.println("Result:");
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                System.out.print("[" + result[row][col] + "]");
            }
            System.out.println();
        }
    }

    public void printResult(List<List<Double>> result) {
        System.out.println("Result");
        for (int row = 0; row < result.size(); row++) {
            for (int col = 0; col < result.getFirst().size(); col++) {
                System.out.print("[" + result.get(row).get(col) + "]");
            }
            System.out.println();
        }
    }
}
