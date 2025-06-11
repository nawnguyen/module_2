package caseStudy.until;

public class ValidateUtil {
    public static boolean isNameValid(String name) {
        return name != null && name.matches(RegexUtil.VIETNAMESE_NAME_REGEX);
    }

    public static boolean isPhoneValid(String phone) {
        return phone != null && phone.matches(RegexUtil.PHONE_NUMBER_REGEX);
    }

    public static boolean isTripIdValid(String tripId) {
        return tripId != null && tripId.matches(RegexUtil.TRIP_ID_REGEX);
    }
}
