import java.util.ArrayList;
import java.util.List;

public class MatrixOperations {

    public double[][] add(double[][] matrix1, double[][]matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            double[][] result = new double[matrix1.length][matrix1[0].length];

            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[row].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        } else {
            System.out.println("The matrix doesn't have the same length, they cannot be added.");
            return null;
        }
    }

    public double[][] multiply(double[][] matrix1, double[][]matrix2) {
        if (matrix1[0].length == matrix2.length) {
            double[][] result = new double[matrix1.length][matrix2[0].length];
            for (int matrix1Row = 0; matrix1Row < matrix1.length; matrix1Row++) {
                for (int row = 0; row < matrix2[0].length; row++) {
                    for (int col = 0; col < matrix2.length; col++) {
                        result[matrix1Row][row] += matrix1[matrix1Row][col] * matrix2[col][row];
                    }
                }
            }
            return result;
        } else {
            System.out.println("The matrix aren't valid for multiplication");
            return null;
        }
    }

    public double[][] transpose(double[][] matrix) {
        double[][] transposed = new double[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transposed[col][row] = matrix[row][col];
             }
        }
        return transposed;
    }

    public List<List<Double>> add(List<List<Double>> matrix1, List<List<Double>> matrix2) {
        if (matrix1.size() == matrix2.size() && matrix1.getFirst().size() == matrix2.getFirst().size()) {
            List<List<Double>> result = new ArrayList<>();
            for (int row = 0; row < matrix1.size(); row++) {
                result.add(new ArrayList<>());
                double addResult = 0;
                for (int col = 0; col < matrix1.getFirst().size(); col++) {
                    addResult = matrix1.get(row).get(col) + matrix2.get(row).get(col);
                    result.get(row).add(addResult);
                }
            }
            return result;
        } else {
            System.out.println("The matrix doesn't have the same size");
            return null;
        }
    }

    public List<List<Double>> multiply(List<List<Double>> matrix1, List<List<Double>> matrix2) {
        if (matrix1.getFirst().size() == matrix2.size()) {
            List<List<Double>> result = new ArrayList<>();
            for (int rowM1 = 0; rowM1 < matrix1.size(); rowM1++) {
                result.add(new ArrayList<>());
                for (int colM2 = 0; colM2 < matrix2.getFirst().size(); colM2++) {
                    double multResult = 0;
                    for (int colM1 = 0; colM1 < matrix1.getFirst().size(); colM1++) {
                        multResult += matrix1.get(rowM1).get(colM1) * matrix2.get(colM1).get(colM2);
                    }
                    result.get(rowM1).add(multResult);
                }
            }
            return result;
        } else {
            System.out.println("The matrix cannot be multiplied");
            return null;
        }
    }

    public List<List<Double>> transpose(List<List<Double>> matrix) {
        List<List<Double>> result = new ArrayList<>();
        for (int row = 0; row < matrix.getFirst().size(); row++) {
            result.add(new ArrayList<>());
            for (int col = 0; col < matrix.size(); col++) {
                result.get(row).add(matrix.get(col).get(row));
            }
        }
        return result;
    }
}
