package ss11.BaiTap.reverseStack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "MỘT HAI BA BỐN";
        String[] works = input.split(" ");

        Stack<String> wStack = new Stack<>();
        for (String work : works) {
            wStack.push(work);
        }
        String output = "";
        while (!wStack.isEmpty()) {
            output += wStack.pop();
            if (!wStack.isEmpty()) {
                output += " ";
            }
        }
        System.out.println("Chuỗi sau khi đảo ngược từ: "+ output);
    }
}
