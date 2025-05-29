package ss15.BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            TriangleChecker.checkTriangle(a, b, c);

            System.out.println("Tam giác hợp lệ với 3 cạnh: " + a + ", " + b + ", " + c);

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng, vui lòng nhập số.");
        }
    }
}

