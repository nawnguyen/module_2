package ss4.BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean checkInput;
        do{
            checkInput = true;

            System.out.print("Enter a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a == 0) {
                    System.out.println("'a' must be different from 0 !");
                    checkInput = false;
                    continue;
                }
            } else {
                System.out.println("Invalid input !");
                checkInput = false;
                scanner.nextLine();
                continue;
            }
            System.out.print("Enter b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.out.println("Invalid input !");
                checkInput = false;
                scanner.nextLine();
                continue;
            }
            System.out.print("Enter c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.out.println("Invalid input !");
                checkInput = false;
                scanner.nextLine();
                continue;
            }
        }while(!checkInput);



        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots:");
            System.out.println("Root 1 = " + equation.getRoot1());
            System.out.println("Root 2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
