package view;

import java.util.Scanner;
import java.util.regex.*;

public class Validation {
    // ------------- isValidString
    public boolean isValidString(String input){
        String regexPattern = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ------------ inputStriing
    public String inputWord(){
        String word = "";
        while(!isValidString(word)){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter word: ");
            word = sc.nextLine();
            if(!isValidString(word)){
                System.out.println("Invalid input!");
            }
        }
        return word;
    }
}
