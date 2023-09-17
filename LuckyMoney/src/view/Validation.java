/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.regex.*;
import java.util.*;

/**
 *
 * @author longle2507
 */
public class Validation {

    public boolean isValidMoney(String money) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(money);
        return matcher.matches();
    }

    public String checkMoney() {
        String valueMoney = "";
        while (!isValidMoney(valueMoney)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter money here:");
            valueMoney = sc.nextLine();
            if(!isValidMoney(valueMoney)){
                System.out.println("Invalid input");
            }
        }
        return valueMoney;
    }
    
    public static void main(String [] args){
        Validation val = new Validation();
        String n = val.checkMoney();
        System.out.println("Your prize: " + n);
    }
}
