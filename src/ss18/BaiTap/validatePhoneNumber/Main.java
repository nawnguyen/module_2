package ss18.BaiTap.validatePhoneNumber;

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "(84)-(0976782874)",
                "(a4)-(097678274)",
                "(84)-(0976782840)",
                "(84)-(497678284)",
                "(84)-(4976782840)",
                "(14)-(097678284)",
        };
        for (String testCase : testCases) {
            System.out.printf("Phone number %s is valid: %b%n", testCase, ValidatePhoneNumber.validatePhoneNumber(testCase));
        }
    }
}