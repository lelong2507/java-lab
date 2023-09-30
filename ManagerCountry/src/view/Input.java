package view;

import java.util.Scanner;

public class Input {
    Validation val = new Validation();

    // --------------------- Input String
    public String inputString() {
        String input = "";
        while (!val.isValidString(input)) {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if (!val.isValidString(input)) {
                System.out.println("Invalid input!");
            }
        }
        return input;
    }

    // --------------------- Input Float
    public float inputFloat() {
        float input = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextFloat()) {
                input = Float.parseFloat(sc.nextLine());

                if (val.isValidFloat(input)) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input. Nhap so a");
                sc.next();
            }
        }

        return input;

    }
}
