package ss2.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double monney = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        monney = scanner.nextDouble();
        System.out.println("Enter number of month");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interset_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = monney * (interset_rate / 100 / 12) * 3;
        }
        System.out.println("Total of interest: " + total_interest);
    }
}
