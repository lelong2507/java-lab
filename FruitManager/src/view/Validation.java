/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.regex.*;

/**
 *
 * @author longle2507
 */

/*private String fruitId;
    private String fruitName;
    private double price;
    private String quantity;
    private String origin;
 */
public class Validation {
    //------------------------- Check number of fruit
    public boolean checkNumberFruits(int fruit){
        if(fruit <= 0){
            return false;
        }
        
        try{
            Integer.parseInt(String.valueOf(fruit));
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    //------------------------- Check String input
    public boolean checkString(String input) {
        String regex = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //------------------------- Check Int input
    public boolean checkInt(String input) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //------------------------- Check Char input
    public boolean checkChar(String input) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //-------------------------- Check Price
    public boolean checkPrice(double price) {
        if (price <= 0) {
            return false;
        }

        try {
            Double.parseDouble(String.valueOf(price));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    // ------------------------- Check Quantity
    public boolean checkQuantity(int quantity){
        if(quantity <= 0){
            return false;
        }
        
        try{
            Integer.parseInt(String.valueOf(quantity));
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }

}
