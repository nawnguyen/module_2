package ss3.BaiTap;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = 0;
        }

        System.out.print("value: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("index: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Nhập giá trị cần chèn (X): ");
        int X = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
            scanner.close();
            return;
        }

        int[] newArray = new int[N + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = X;

        for (int i = index; i < N; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.print("new value: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}