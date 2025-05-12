package ss1.bai_tap.thuc_hanh;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello: "+ name);
    }
}
