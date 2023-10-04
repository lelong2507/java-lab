package Controller;

import java.util.*;

import View.Menu;
import View.ValidNumber;
import View.ValidOperator;
import model.Number;

public class ComputerProgram extends Menu<Number> {

    Number n;
    ComputerManagement cm;
    ValidNumber vn;
    ValidOperator vo;

    public ComputerProgram(String td, String[] mc) {
        super(td, mc);
        n = new Number();
        cm = new ComputerManagement();
        vn = new ValidNumber();
        vo = new ValidOperator();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                normalCalculator();
                break;
            case 2:
                bmiCalculator();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void normalCalculator() {
        cm.normalCalculator();
    }

    public void bmiCalculator() {
        System.out.print("Enter weight: ");
        double weight = vn.inputDouble();
        System.out.print("Enter height: ");
        double height = vn.inputDouble();
        cm.bmiCalculator(weight, height);

    }
}
