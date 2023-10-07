package view;

import java.util.regex.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author longle2507
 */
public class Validation {
    
    // ---------------- IsValidNumberDoctor
    public boolean isValidNumber(int n){
         if (n <= 0) {
            return false;
        }

        try {
            Integer.parseInt(String.valueOf(n));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // ----------------- IsValidCode
    public boolean isValidCode(String code) {
        String regexPattern = "DOC\\s+\\d+";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    // ----------------- IsValidString
    public boolean isValidString(String input) {
        String regexPattern = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ------------------ IsValidAvailability
    public boolean isValidAvailability(int availability) {
        if (availability <= 0) {
            return false;
        }

        try {
            Integer.parseInt(String.valueOf(availability));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
