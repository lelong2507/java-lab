package view;


import java.util.Scanner;
import java.util.regex.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author longle2507
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    // check phoneNumber
    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // check userName
    public boolean isValidUserName(String userName) {
        String regex = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }

    public String checkPhoneNumber() {
        String phoneNumber = "";
        while (!isValidPhoneNumber(phoneNumber)) {
            System.out.println("Enter Phone Number: ");
            phoneNumber = sc.nextLine();
            if (!isValidPhoneNumber(phoneNumber)) {
                System.out.println("Invalid input");
            }
        }
        return phoneNumber;
    }

    public String checkUserName() {
        String userName = "";
        while (!isValidPhoneNumber(userName)) {
            System.out.println("Enter User Name: ");
            userName = sc.nextLine();
            if (!isValidPhoneNumber(userName)) {
                System.out.println("Invalid input");
            }
        }
        return userName;
    }

    public static void main(String[] args) {
        Validation val = new Validation();
        String phoneNumber = val.checkPhoneNumber();
        String userName = val.checkUserName();
    }
}
