package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    // ------------- isValidId
    public boolean isValidId(int input) {
        if (input <= 0) {
            return false;
        }

        try {
            Integer.parseInt(String.valueOf(input));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // ------------- isValidName
    public boolean isValidString(String input) {
        String regexPattern = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ------------- isValidSalary
    public boolean isValidSalary(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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

            // Kiểm tra ngày tháng năm hợp lệ (ví dụ: tháng 2 không thể có ngày 30)
            if (month == 2 && (day > 29 || (day == 29 && !isLeapYear(year)))) {
                return false;
            }

            return true;
        }

        return false;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
