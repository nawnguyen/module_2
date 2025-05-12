package ss3.BaiTap;

import java.util.Scanner;

public class FindMaxMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] staticMatrix = {
                {1.5, 2.3, 0.8},
                {4.2, 3.1, 5.6},
                {2.7, 6.4, 1.9}
        };
        System.out.println("Ma trận tĩnh để kiểm tra:");
        printMatrix(staticMatrix);
        findMaxElement(staticMatrix);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Ma trận bạn đã nhập:");
        printMatrix(matrix);

        findMaxElement(matrix);

        scanner.close();
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaxElement(double[][] matrix) {
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất: " + maxValue);
        System.out.println("Tọa độ: [" + maxRow + "][" + maxCol + "]");
        System.out.println();
    }
}