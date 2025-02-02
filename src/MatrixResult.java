import java.util.List;

public class MatrixResult {
    InputMatrix inputMatrix = new InputMatrix();
    MatrixOperations matrixOperations = new MatrixOperations();
    MatrixPrinter matrixPrinter = new MatrixPrinter();

    public void addArray() {
        System.out.println("Enter the first Matrix");
        double[][] matrix1 = inputMatrix.inputMatrixArray();
        System.out.println("Enter the second Matrix");
        double[][] matrix2 = inputMatrix.inputMatrixArray();
        double[][] addResult = matrixOperations.add(matrix1,matrix2);
        matrixPrinter.printResult(addResult);
    }

    public void multiplyArray() {
        System.out.println("Enter the first Matrix");
        double[][] matrix1 = inputMatrix.inputMatrixArray();
        System.out.println("Enter the second Matrix");
        double[][] matrix2 = inputMatrix.inputMatrixArray();
        double[][] multResult = matrixOperations.multiply(matrix1,matrix2);
        matrixPrinter.printResult(multResult);
    }

    public void transposeArray() {
        double[][] matrix = inputMatrix.inputMatrixArray();
        double[][] transResult = matrixOperations.transpose(matrix);
        matrixPrinter.printResult(transResult);
    }

    public void addList() {
        System.out.println("Enter the first Matrix");
        List<List<Double>> matrix1 = inputMatrix.inputMatrixList();
        System.out.println("Enter the second Matrix");
        List<List<Double>> matrix2 = inputMatrix.inputMatrixList();
        List<List<Double>> addResult = matrixOperations.add(matrix1,matrix2);
        matrixPrinter.printResult(addResult);
    }

    public void multiplyList() {
        System.out.println("Enter the first Matrix");
        List<List<Double>> matrix1 = inputMatrix.inputMatrixList();
        System.out.println("Enter the second Matrix");
        List<List<Double>> matrix2 = inputMatrix.inputMatrixList();
        List<List<Double>> multResult = matrixOperations.multiply(matrix1,matrix2);
        matrixPrinter.printResult(multResult);
    }

    public void transposeList() {
        List<List<Double>> matrix = inputMatrix.inputMatrixList();
        List<List<Double>> transResult = matrixOperations.transpose(matrix);
        matrixPrinter.printResult(transResult);
    }
}
