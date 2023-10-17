/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import view.Validation;

/**
 *
 * @author longle2507
 */
public class Input {

    Validation val = new Validation();

    // -------- inputString
    public String inputString() {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(input)) {
            input = sc.nextLine();
            if (!val.isValidString(input)) {
                System.out.println("Just String!");
            }
        }
        return input;
    }

    // --------- inputFloat
    public float inputFloat() {
        float number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (val.isValidFloat(input)) {
                number = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return number;
    }
}
