package ss11.BaiTap.decimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        int temp = decimal;
        while (temp > 0) {
            int remainder = temp % 2;
            stack.push(remainder);
            temp = temp / 2;
        }

        System.out.print("Số nhị phân tương ứng: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
