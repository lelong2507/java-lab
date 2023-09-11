package lab211_assignment.letterCharacter.view;

import java.util.Scanner;
import java.util.regex.*;

import lab211_assignment.letterCharacter.common.Alogorithm;
import lab211_assignment.letterCharacter.model.Element;

import lab211_assignment.searching.common.Library;

public class Validation {
    static Scanner sc = new Scanner(System.in);

    // check String
    public boolean inputCorrect(String input) {
        String correctInput = "^(?!\\s*$)[^\\d]+$";
        Pattern pattern = Pattern.compile(correctInput);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public String isValidInput() {
        String input = "";
        while (!inputCorrect(input)) {
            System.out.println("Enter String here: ");
            input = sc.nextLine();
            if (!inputCorrect(input)) {
                System.out.println("Invalid input");
            }
        }
        return input;
    }
    // check character
    public boolean charCorrect(char inputChar) {
        String input = String.valueOf(inputChar);
        String inputPattern = "^(?!\\s*$)[^\\d]+$";
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public char isValidChar() {
        char charInput = 0;
        while (true){
            System.out.println("Enter the Char here: ");
            String line = sc.nextLine();
            if(line.length() == 1){
                charInput = line.charAt(0);
                if(Character.isLetter(charInput)){
                    break;
                }else{
                    System.out.println("Invalid input!");
                }
            }else{
                System.out.println("Invalid input!");
            }
        }
        return charInput;
    }



  
}
