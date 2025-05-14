package ss3.BaiTap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello, codegym da nang !";
        System.out.println("String: " + str);

        System.out.print("Enter a character:");
        char keyChar = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == keyChar) {
                count++;
            }
        }
        System.out.println("Character: " + "'" + keyChar + "'" + " appears " + count + " times in the string.");
    }
}
