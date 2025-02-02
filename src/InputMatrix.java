import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMatrix {


    public double[][] inputMatrixArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        Scanner scanner1 = new Scanner(System.in);


        for (int row = 0; row < rows; row++) {
            System.out.println("Row " + (row+1) + ":");
            for (int col = 0; col < columns ; col++) {
                System.out.println("Number " + (col+1) + ":");
                matrix[row][col] = scanner1.nextDouble();
            }
        }
        return  matrix;
    }

    public List<List<Double>> inputMatrixList() {
        List<List<Double>> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row on the matrix");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns on the matrix");
        int columns = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);

        for (int row = 0; row < rows; row++) {
            result.add(new ArrayList<>());
            System.out.println("Row " + (row+1) + ":");
            for (int col = 0; col < columns; col++) {
                System.out.println("Number " + (col+1) + ":");
                double number = scanner1.nextDouble();
                result.get(row).add(number);
            }
        }
        return result;
    }
}
