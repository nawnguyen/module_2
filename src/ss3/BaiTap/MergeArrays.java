package ss3.BaiTap;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        System.out.print("Mảng 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Mảng 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Mảng 3 (gộp): ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}