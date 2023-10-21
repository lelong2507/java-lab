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

        HashMap<String, StringBuilder> characters = new HashMap<>();

        characters.put("all characters", new StringBuilder());
        characters.put("uppercase characters", new StringBuilder());
        characters.put("lowercase characters", new StringBuilder());
        characters.put("special characters", new StringBuilder());

        String charString = input.replaceAll("^[\\d]*", "").replaceAll("[\\d]+", "");

        for (int i = 0; i < charString.length(); i++) {

            characters.get("all characters").append(charString.charAt(i));

            if (Character.isUpperCase(charString.charAt(i))) {
                characters.get("uppercase characters").append(charString.charAt(i));
            }
            if (Character.isLowerCase(charString.charAt(i))) {
                characters.get("lowercase characters").append(charString.charAt(i));
            }
            if (!Character.isLetter(charString.charAt(i))) {
                characters.get("special characters").append(charString.charAt(i));
            }
        }
        return characters;
    }

}
