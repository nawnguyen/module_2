package ss2.bai_tap;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();

                    for (int i = 1; i <= height; i++) { // Vòng lặp ngoài: số dòng
                        for (int j = 1; j <= width; j++) { // Vòng lặp trong: số cột
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Choose corner position:");
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.print("Enter position (1-4): ");
                    int position = scanner.nextInt();
                    System.out.print("Enter size: ");
                    int size = scanner.nextInt();

                    switch (position) {
                        case 1:
                            for (int i = size; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        case 2: // Top-right
                            for (int i = size; i >= 1; i--) {
                                for (int j = 1; j <= size - i; j++) {
                                    System.out.print("  ");
                                }
                                // In *
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        case 3:
                            for (int i = 1; i <= size; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        case 4:
                            for (int i = 1; i <= size; i++) {
                                for (int j = 1; j <= size - i; j++) {
                                    System.out.print("  ");
                                }
                                // In *
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        default:
                            System.out.println("Invalid position!");
                    }
                    break;

                case 3:
                    System.out.print("Enter height: ");
                    int isoHeight = scanner.nextInt();

                    for (int i = 1; i <= isoHeight; i++) {
                        for (int j = 1; j <= isoHeight - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}