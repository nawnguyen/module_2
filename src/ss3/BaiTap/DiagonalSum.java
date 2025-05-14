package ss3.BaiTap;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận vuông (số hàng/cột): ");
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Ma trận đã nhập:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính: " + diagonalSum);
    }
}