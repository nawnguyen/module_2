package ss13.BaiTap;

import java.util.Scanner;

public class IncreasingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();

        String result = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (current.isEmpty() || ch > current.charAt(current.length() - 1)) {
                current += ch;
                if (current.length() > result.length()) {
                    result = current;
                }
            } else {
                current = "" + ch;
            }
        }

        System.out.println("Chuỗi con tăng dần lớn nhất: " + result);
    }
}
