package view;

import java.util.regex.*;

public class Validation {

    public boolean checkPhoneNumber(String input) {
        String regexPattern = "^[0-9]{10,}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // --------------- checkValidEmail
    public boolean checkEmail(String input) {
        String regexPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ---------- isValidDate
    public boolean isValidDate(String input) {
        String regexDate = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
        Pattern pattern = Pattern.compile(regexDate);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));
            if (month == 2 && (day > 29 || (day == 29 && !isLeapYear(year)))) {
                return false;
            }

            return true;
        }

        return false;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    
}