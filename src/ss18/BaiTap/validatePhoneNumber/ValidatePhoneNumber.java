package ss18.BaiTap.validatePhoneNumber;

public class ValidatePhoneNumber {
    private static final String PHONE_PATTERN = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_PATTERN);
    }
}