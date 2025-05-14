package ss3.BaiTap;

import java.util.Scanner;

public class MatrixColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Nhập thứ tự cột cần tính tổng (từ 0 đến " + (cols - 1) + "): ");
        int column = scanner.nextInt();

        if (column >= 0 && column < cols) {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][column];
            }
            System.out.println("Tổng các phần tử của cột " + column + " là: " + sum);
        } else {
            System.out.println("Cột không hợp lệ!");
        }
    }
}