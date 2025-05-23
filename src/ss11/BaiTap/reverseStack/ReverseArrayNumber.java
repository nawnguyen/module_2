package ss11.BaiTap.reverseStack;

import java.util.Stack;

public class ReverseArrayNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
}
