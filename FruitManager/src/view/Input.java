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

    private Validation val = new Validation();
   
    // ------------------------ Input variable String
    public String checkString() {
        String input = "";
        while (!val.checkString(input)) {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if (!val.checkString(input)) {
                System.out.println("Invalid input!");
            }
        }
        return input;
    }

    // ------------------------ Input variable Int
    public String checkInt() {
        String input = "";
        while (!val.checkInt(input)) {
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if (!val.checkInt(input)) {
                System.out.println("Invalid input!");
            }
        }
        return input;
    }

    // ------------------------- Input Y or N
    public String checkYN() {
        String input = "";
        while (!val.checkChar(input)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter here: ");
            input = sc.nextLine();
            if (!val.checkChar(input)) {
                System.out.println("Invalid input! Just (Y/N)!");
            }
        }
        return input;
    }
    // ------------------------- Input price

    public double inputPrice() {
        double price = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the price: ");
            if (sc.hasNextDouble()) {
                price = sc.nextDouble();
                if (val.checkPrice(price)) {
                    break;
                } else {
                    System.out.println("Invalid input. Gia ma am hoac be hon 0"
                            + "cho co ma ban nha`");
                }
            } else {
                System.out.println("Invalid input. Nhap so.");
                sc.next();
            }
        }
        return price;
    }

    //  ------------------------- Input quantity
    public int inputQuantity() {
        int quantity = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the quantity: ");
            if (sc.hasNextInt()) {
                quantity = sc.nextInt();
                if (val.checkQuantity(quantity)) {
                    break;
                } else {
                    System.out.println("Invalid input. Co ai di nhap so luong bang am khong "
                            + "it nhat cung cho ho duong chu ");
                }
            } else {
                System.out.println("Invalid input. Nhap so a");
                sc.next();
            }
        }
        return quantity;
    }

    public static void main(String[] args) {
        Input input = new Input();
        int quantity = input.inputQuantity();
    }

}
