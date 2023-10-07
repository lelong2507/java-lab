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
public class Input {

    Validation val = new Validation();

    // --------------- Input Number
    public int inputNumberEle(){
        int size = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of Array: ");
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                if (val.isValidNumber(size)) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input! Enter Integer");
                sc.next();
            }
        }
        return size;
    }
    // ---------------- Input Code
    public String inputCode() {
        String code = "";
        while (!val.isValidCode(code)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Code: ");
            code = sc.nextLine();
            if (!val.isValidCode(code)) {
                System.out.println("Invalid input! You must follow this format 'DOC...'");
            }
        }
        return code;
    }

    // ---------------- Input Name
    public String inputName() {
        String name = "";
        while (!val.isValidString(name)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            if (!val.isValidString(name)) {
                System.out.println("Invalid input!");
            }
        }
        return name;
    }

    // ---------------- Input Specialization
    public String inputSpecialization() {
        String specialization = "";
        while (!val.isValidString(specialization)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            specialization = sc.nextLine();
            if (!val.isValidString(specialization)) {
                System.out.println("Invalid input!");
            }
        }
        return specialization;
    }

    // ---------------- Input Availability
    public int inputAvailability() {
        int availability = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Availability: ");
            if (sc.hasNextInt()) {
                availability = sc.nextInt();
                if (val.isValidAvailability(availability)) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input! Enter Integer!");
                sc.next();
            }
        }
        return availability;
    }
}
