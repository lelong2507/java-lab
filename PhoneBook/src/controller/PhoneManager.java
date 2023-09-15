/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.Scanner;
import model.Phone;
import view.*;

/**
 *
 * @author longle2507
 */

/*
1. Add new phone
2. Delete new phone
3. Display user
4. Display all phoneNumber
5. Delete all
6. Exit
 */
public class PhoneManager extends Menu<String> {

    protected Algorithm alg;
    protected Phone phone;
    protected Validation val;
    static Scanner sc = new Scanner(System.in);

    public PhoneManager(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
        phone = new Phone();
        val = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                displayUser();
                break;
            case 4:
                displayAll();
                break;
            case 5:
                deleteAll();
                break;
            case 6:
                System.exit(0);
        }
    }

    public void add() {
        String phoneNumber = val.checkPhoneNumber();
        String userName = val.checkUserName();
        phone = new Phone(phoneNumber, userName);
        alg.addNewPhone(phoneNumber, userName);
    }

    public void delete() {
        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        alg.deletePhone(phoneNumber);
    }

    public void displayUser() {
        System.out.println("Enter the phoneNumber: ");
        String phoneNumber = sc.nextLine();
        alg.displayUser(phoneNumber);
    }

    public void displayAll() {
        alg.displayAll();
    }

    public void deleteAll() {
        alg.deleteAll();
    }

}
