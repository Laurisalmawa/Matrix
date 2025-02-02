import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Matrix Operator");
        System.out.println("What method do you want to use?");
        System.out.println("1. Array");
        System.out.println("2. List");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        MatrixResult matrixResult = new MatrixResult();

        switch (option) {
            case 1:
                System.out.println("Choose the operation you want to do:");
                System.out.println("1. Add");
                System.out.println("2. Multiply");
                System.out.println("3. Transpose");
                int optionArray = scanner.nextInt();
                switch (optionArray) {
                    case 1:
                        matrixResult.addArray();
                        break;
                    case 2:
                        matrixResult.multiplyArray();
                        break;
                    case 3:
                        matrixResult.transposeArray();
                        break;
                    default:
                }
                break;
            case 2:
                System.out.println("Choose the operation you want to do:");
                System.out.println("1. Add");
                System.out.println("2. Multiply");
                System.out.println("3. Transpose");
                int optionList = scanner.nextInt();
                switch (optionList) {
                    case 1:
                        matrixResult.addList();
                        break;
                    case 2:
                        matrixResult.multiplyList();
                        break;
                    case 3:
                        matrixResult.transposeList();
                        break;
                    default:
                }
                break;
            default:
        }
    }
}