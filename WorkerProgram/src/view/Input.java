package view;

import java.util.Scanner;

public class Input {

    Validation val = new Validation();

    // ------------- inputId
    public int inputId() {
        int id = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                if (val.isValidId(id)) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input! Enter Integer!");
                sc.next();
            }
        }
        return id;
    }

    // ------------- inputAge
    public int inputAge() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (val.isValidId(age)) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input! Enter Integer!");
                sc.next();
            }
        }
        return age;
    }

    // ----------------------- Input name
    public String inputName() {
        String fullName = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(fullName)) {
            System.out.print("Enter Name: ");
            fullName = sc.nextLine();
            if (!val.isValidString(fullName)) {
                System.out.println("Invalid input!");
            }
        }
        return fullName;
    }

    // ---------------------- inputSalary
    public double inputSalary() {
        double number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Salary:");
            String input = sc.nextLine();
            if (val.isValidSalary(input)) {
                number = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return number;
    }

    // ----------------------- Input FullName
    public String inputWorkLocation() {
        String workLocation = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(workLocation)) {
            System.out.print("Enter Work Location: ");
            workLocation = sc.nextLine();
            if (!val.isValidString(workLocation)) {
                System.out.println("Invalid input!");
            }
        }
        return workLocation;
    }

    // ---------------- Input date
    public String inputDate() {
        String date = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidDate(date)) {
            System.out.print("Enter date to change: ");
            date = sc.nextLine();
            if (!val.isValidDate(date)) {
                System.out.println("Invalid input!");
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Input in = new Input();
        in.inputDate();
    }
}
