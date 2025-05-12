package ss3.BaiTap;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng: " + minValue);

        int[] staticArray = {5, 2, 9, 1, 7, 6, 3};
        System.out.print("Mảng khởi tạo sẵn: ");
        for (int num : staticArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        minValue = staticArray[0];
        for (int i = 1; i < staticArray.length; i++) {
            if (staticArray[i] < minValue) {
                minValue = staticArray[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng khởi tạo sẵn: " + minValue);

        scanner.close();
    }
}