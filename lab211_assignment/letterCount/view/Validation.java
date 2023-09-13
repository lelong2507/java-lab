package letterCount.view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void main(String[] args) {
        Validation vl = new Validation();
        String input = vl.isValidInput();
    }
}
