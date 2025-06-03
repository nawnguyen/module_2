package ss15.BaiTap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = inputSide(scanner, "a");
        double b = inputSide(scanner, "b");
        double c = inputSide(scanner, "c");

        try {
            TriangleChecker.checkTriangle(a, b, c);
            System.out.println("Tam giác hợp lệ với 3 cạnh: " + a + ", " + b + ", " + c);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi tam giác: " + e.getMessage());
        }
    }

    private static double inputSide(Scanner scanner, String sideName) {
        double side = -1;
        while (true) {
            try {
                System.out.print("Nhập cạnh " + sideName + ": ");
                side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Cạnh " + sideName + " phải > 0. Nhập lại!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Sai định dạng! Vui lòng nhập số cho cạnh " + sideName + ".");
                scanner.nextLine();
            }
        }
        return side;
    }
}
