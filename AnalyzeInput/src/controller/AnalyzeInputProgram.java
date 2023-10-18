package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Iinput;

public class AnalyzeInputProgram implements Iinput {

    @Override
    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> result = new HashMap<>();
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> squareNumbers = new ArrayList<>();

        
        Pattern numberPattern = Pattern.compile("-?\\d+");
        Matcher matcher = numberPattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            allNumbers.add(number);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
            if (Math.sqrt(number) % 1 == 0) {
                squareNumbers.add(number);
            }
        }
        result.put("square numbers", squareNumbers);
        result.put("all numbers", allNumbers);
        result.put("even numbers", evenNumbers);
        result.put("odd numbers", oddNumbers);

        return result;
    }

    @Override
    public HashMap<String, StringBuilder> getCharacter(String input) {
        HashMap<String, StringBuilder> result = new HashMap<>();
        StringBuilder allChars = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        StringBuilder upperChars = new StringBuilder();
        StringBuilder lowerChars = new StringBuilder();

        for (char c : input.toCharArray()) {
            allChars.append(c);

            if (Character.isUpperCase(c)) {
                upperChars.append(c);
            } else {
                lowerChars.append(c);
            }

            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialChars.append(c);
            }
        }

        result.put("all characters", allChars);
        result.put("special characters", specialChars);
        result.put("uppercase characters", upperChars);
        result.put("lowercase characters", lowerChars);

        return result;
    }

}
