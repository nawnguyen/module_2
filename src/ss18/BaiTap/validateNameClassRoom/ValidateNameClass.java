package ss18.BaiTap.validateNameClassRoom;

public class ValidateNameClass {
    public static boolean validateName(String name) {
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        return name.matches(regex);
    }
}
