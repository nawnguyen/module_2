package ss13.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) return -1;

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Nhập số cần tìm: ");
        int value = sc.nextInt();

        int result = binarySearch(array, 0, array.length - 1, value);

        if (result != -1) {
            System.out.println("Tìm thấy " + value + " tại vị trí index: " + result);
        } else {
            System.out.println("Không tìm thấy " + value + " trong mảng.");
        }
    }
}
