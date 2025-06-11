package caseStudy.until;

public class RegexUtil {
    public static final String VIETNAMESE_NAME_REGEX = "^[a-zA-Zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ\\s]{2,}$";
    public static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    public static final String TRIP_ID_REGEX = "^[A-Z]{2}-[A-Z]{2}\\d{2}$";
}
