package bai_tap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien USD: ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.print("Gia tri VND: " + convert);
    }
}
