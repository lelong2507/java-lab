package Controller;

import java.util.*;
import java.util.Map.*;

import View.ValidNumber;
import View.ValidOperator;
import model.Number;
import model.Operator;

public class ComputerManagement {

    ValidNumber vn = new ValidNumber();
    ValidOperator vo = new ValidOperator();

    // ------------------------- Normal calculator
    public void normalCalculator() {
        System.out.print("Enter First Number: ");
        double result = vn.inputDouble();
        boolean isContiue = true;
        while (isContiue == true) {
            String op = vo.inputOperator();
            if(op.equals("=")){
                System.out.println("Result: " + result);
                break;
            }
            System.out.print("Enter second number:  ");
            double b = vn.inputDouble();
            switch (op) {
                case "+":
                    result += b;
                    System.out.println("Memory: " + result);
                    break;
                case "-":
                    result -= b;
                    System.out.println("Memory: " + result);
                    break;
                case "*":
                    result *= b;
                    System.out.println("Memory: " + result);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Cannot divide by 0.");
                    } else {
                        result /= b;
                        System.out.println("Memory: " + result);
                    }
                    break;
                case "^":
                    result = Math.pow(result, b);
                    System.out.println("Result: " + result);
                    break;
            }
        }
    }

    // ------------------------ BMI calculator
    public void bmiCalculator(double weight, double height) {
        double bmi = weight / Math.pow(height / 100, 2);
        System.out.println("BMI number: " + bmi);
        if (bmi < 18.5) {
            System.out.println("BMI status: UNDER-STANDARD");
        } else if (bmi < 25) {
            System.out.println("BMI status: STANDARD");
        } else if (bmi < 30) {
            System.out.println("BMI status: OVER-WEIGHT");
        } else if (bmi < 35) {
            System.out.println("BMI status: FAT");
        } else if (bmi < 40) {
            System.out.println("BMI status: VERY FAT");
        } else {
            System.out.println("DANGER!");
        }
    }
}
