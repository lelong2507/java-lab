package lab211_assignment.letterCharacter.controller;

import java.util.*;
import lab211_assignment.letterCharacter.model.*;
import lab211_assignment.letterCharacter.common.Alogorithm;
import lab211_assignment.letterCharacter.view.*;

public class Program extends Menu<Element> {
    protected Alogorithm alg;
    protected Validation val;

    public Program(String title, String[] mChon) {
        super(title, mChon);
        val = new Validation();
        alg = new Alogorithm();
    }

    public static void main(String[] args) {
        String[] mChon = { "Find", "Count", "Exit" };
        Program pr = new Program("Main Menu", mChon);
        pr.run();
    }
  

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                find();
                break;
            case 2:
                count();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void find() {
        Validation vl = new Validation();
        String input = val.isValidInput();
        Element ele = new Element(input);
        alg.findCharacter(input);
    }

    public void count() {
        Validation vl = new Validation();
        String input = val.isValidInput();
        Element ele = new Element(input);
        alg.countChar(input);
    }

}
