package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import model.Input;
import view.Menu;

public class Program extends Menu<Input> {
    Input in;
    AnalyzeInputProgram aip;
    String input;

    public Program(String td, String[] mc) {
        super(td, mc);
        in = new Input();
        aip = new AnalyzeInputProgram();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addInput();
                break;
            case 2:
                executeInput();
                break;
            case 3:
                System.exit(0);

        }
    }

    public void addInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        input = sc.nextLine();
        in = new Input(input);
    }

    public void executeInput() {
        HashMap<String, List<Integer>> numberAnalysis = aip.getNumber(input);
        HashMap<String, StringBuilder> characterAnalysis = aip.getCharacter(input);

        System.out.println("------------- Result Analysis -------------");
        System.out.println("Number of characters: " + input.length());
        System.out.println("All characters: " + characterAnalysis.get("all characters"));
        System.out.println("Uppercase characters: " + characterAnalysis.get("uppercase characters"));
        System.out.println("Lowercase characters: " + characterAnalysis.get("lowercase characters"));
        System.out.println("Numbers: " + numberAnalysis.get("all numbers"));
        System.out.println("Even numbers: " + numberAnalysis.get("even numbers"));
        System.out.println("Odd numbers: " + numberAnalysis.get("odd numbers"));
        System.out.println("Square numbers: " + numberAnalysis.get("square numbers"));
        System.out.println("Special characters: " + characterAnalysis.get("special characters"));
    }
}
