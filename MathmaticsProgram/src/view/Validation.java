/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author longle2507
 */
public class Validation {
    //------------------------------- Valid input number
    public boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //------------------------------- Check input number
    public float inputNumber() {
        float number = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (isValidNumber(input)) {
                number = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Invalid number! Please enter a valid number:");
            }
        }

        return number;
    }
}
