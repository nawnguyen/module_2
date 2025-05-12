package ss1.bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Chi cho phep nhap so tu 0 den 999.");
            return;
        }

        if (number == 0) {
            System.out.println("zero");
            return;
        }

        String result = "";

        if (number >= 100) {
            int hundreds = number / 100;
            result += getDigitWord(hundreds) + " hundred";
            number %= 100;
            if (number != 0) {
                result += " and ";
            }
        }

        if (number >= 20) {
            int tens = number / 10;
            result += getTensWord(tens);
            number %= 10;
            if (number != 0) {
                result += " " + getDigitWord(number);
            }
        } else if (number >= 10) {
            result += getTeenWord(number);
        } else if (number > 0) {
            result += getDigitWord(number);
        }

        System.out.println(result);
    }

    public static String getDigitWord(int num) {
        switch (num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String getTeenWord(int num) {
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String getTensWord(int num) {
        switch (num) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
