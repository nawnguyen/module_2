package ss3.BaiTap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) { int[] array = {1, 3, 5, 7, 9, 7, 11};
        System.out.print("value: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa (X): ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng.");
            scanner.close();
            return;
        } else {
            System.out.println("Phần tử " + X + " xuất hiện tại vị trí: " + index_del);
        }

        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Ghi đè phần tử phía sau lên phần tử hiện tại
        }

        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        System.out.print("new value: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}