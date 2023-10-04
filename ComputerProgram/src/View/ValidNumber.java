package View;

import java.util.Scanner;

public class ValidNumber {
    // ---------------------- isValidNumber
    public boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // ---------------------- inputNumber
    public double inputDouble() {
        double number = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (isValidDouble(input)) {
                number = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return number;
    }
}
