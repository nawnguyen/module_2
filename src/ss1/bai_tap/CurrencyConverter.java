package ss1.bai_tap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double RATE = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap so tien USD: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Đầu vào không hợp lệ! Nhập lại một số");
                scanner.next();
            } else {
                usd = scanner.nextDouble();
                if (usd < 1 || usd > 1000) {
                    System.out.println("Đầu vào không hợp lệ! Hãy nhập số trong khoảng 1 đến 1000");
                } else {
                    break;
                }
            }
        }

        double convert = usd * RATE;
        System.out.println("Gia tri VND: " + convert);
    }
}
