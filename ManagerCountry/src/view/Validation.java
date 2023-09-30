package view;

import java.util.regex.*;

public class Validation {
    // String countryCode, String countryName, float totalArea, String
    // countryTerrain

    // ------------------------------------------- Check String
    public boolean isValidString(String input) {
        String regex = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ------------------------------------------- Check Float
    public boolean isValidFloat(float input) {
        if (input <= 0) {
            return false;
        }
        try {
            Float.parseFloat(String.valueOf(input));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
