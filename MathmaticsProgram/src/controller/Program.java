package controller;

import java.util.*;

import view.Menu;
import view.Validation;

public class Program extends Menu<Float> {
    List<Float> superList;
    List<Float> quaraticList;
    MathManager mm;
    Validation val;

    public Program(String td, String[] mc) {
        super(td, mc);
        superList = new ArrayList<>();
        quaraticList = new ArrayList<>();
        mm = new MathManager();
        val = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                superlativeEquation();
                break;
            case 2:
                quaraticEquation();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void superlativeEquation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = val.inputNumber();
        System.out.print("Input b: ");
        float b = val.inputNumber();
        mm.superlativeEquation(a, b);
        mm.findNumberSuperlative(superList);
    }

    public void quaraticEquation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = val.inputNumber();
        System.out.print("Input b: ");
        float b = val.inputNumber();
        System.out.print("Input c: ");
        float c = val.inputNumber();
        mm.quaraticEquation(a, b, c);
        mm.findNumberQuaratic(quaraticList);
    }

}