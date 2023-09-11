package lab211_assignment.letterCharacter.common;

import java.util.Scanner;

import lab211_assignment.letterCharacter.view.Validation;

public class Alogorithm {
    static Scanner sc = new Scanner(System.in);
    Validation vl = new Validation();

    public void findCharacter(String input) {
        char target = vl.isValidChar();
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (target == input.charAt(i)) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("This character " + target + " in: " + index + " in String.");
        } else {
            System.out.println("Not found");
        }
    }

    public void countChar(String input) {
        int count = 0;
        char target = vl.isValidChar();
        for (int i = 0; i < input.length(); i++) {
            if (target == input.charAt(i)) {
                count++;
            }

        }

        if (count != 0) {
            System.out.println(target + " = " + count);
        }else{
            System.out.println("Not Found");
        }
    }
}
