package view;

import java.util.Scanner;

public class Input {

    Validation val = new Validation();

    // ----------------------- Input id;
    public int inputId() {
        int id = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter id: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                if (val.isVlaidId(id)) {
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

    // ----------------------- Input FullName
    public String inputFullName() {
        String fullName = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(fullName)) {
            System.out.print("Enter Full Name: ");
            fullName = sc.nextLine();
            if (!val.isValidString(fullName)) {
                System.out.println("Invalid input!");
            }
        }
        return fullName;
    }

    // ----------------------- Input Group
    public String inputGroup() {
        String group = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(group)) {
            System.out.print("Enter Group: ");
            group = sc.nextLine();
            if (!val.isValidString(group)) {
                System.out.println("Invalid input!");
            }
        }
        return group;
    }

    // ----------------------- Input Address
    public String inputAddress() {
        String address = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(address)) {
            System.out.print("Enter Address: ");
            address = sc.nextLine();
            if (!val.isValidString(address)) {
                System.out.println("Invalid input!");
            }
        }
        return address;
    }

    // ----------------------- Input PhoneNumber
    public String inputPhoneNumber() {
        String phoneNumber = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidPhoneNumber(phoneNumber)) {
            System.out.print("Enter Phone Number: ");
            phoneNumber = sc.nextLine();
            if (!val.isValidPhoneNumber(phoneNumber)) {
                System.out.println("Invalid input!");
            }
        }
        return phoneNumber;
    }

    // ----------------------- Input firstName
    public String inputFirstName() {
        String firstName = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(firstName)) {
            System.out.print("Enter FirstName: ");
            firstName = sc.nextLine();
            if (!val.isValidString(firstName)) {
                System.out.println("Invalid input!");
            }
        }
        return firstName;
    }

    // ----------------------- Input lastName
    public String inputLastName() {
        String lastName = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidString(lastName)) {
            System.out.print("Enter LastName: ");
            lastName = sc.nextLine();
            if (!val.isValidString(lastName)) {
                System.out.println("Invalid input!");
            }
        }
        return lastName;
    }

    public static void main(String[] args) {
        Input in = new Input();
        in.inputPhoneNumber();
    }
}
