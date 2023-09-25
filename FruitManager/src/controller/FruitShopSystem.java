/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.*;
import view.*;

/**
 *
 * @author longle2507
 */
public class FruitShopSystem extends Menu<Fruit> {

    private Input input;
    private FruitManager fm;
    private ManagerOrder mo;
    private Fruit fruit;

    public FruitShopSystem(String title, String[] mc) {
        super(title, mc);
        input = new Input();
        fm = new FruitManager();
        mo = new ManagerOrder();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addFruit();
                break;
            case 2:
                viewOderList();
                break;
            case 3:
                shopping();
                break;
            case 4:
                System.exit(0);
        }
    }

    // ---------------------- Add Fruit
    public void addFruit() {
        System.out.println("------------------- Create Fruit ----------------");
        System.out.print("Enter ID:");
        String id = input.checkInt();
        System.out.print("Enter name fruit: ");
        String nameFruit = input.checkString();
        double price = input.inputPrice();
        int quantity = input.inputQuantity();
        System.out.println("Enter Origin: ");
        String origin = input.checkString();
        Fruit newFruit = new Fruit(id, nameFruit, price, quantity, origin);
        fm.addFruit(newFruit);
    }

    // ---------------------- View Order List
    public void viewOderList() {
        mo.showAll();
    }

    // ---------------------- Shopping Mall
    public void shopping() {
        Map<Fruit, Integer> orderList = new HashMap<>();
        fm.displayFru();
        while (true) {
            System.out.println("Choose fruit: ");
            String idFruit = input.checkInt();
            Fruit fruit = fm.searchFruit(idFruit);
            System.out.println("You selected: " + fruit.getFruitName() + " |Quantity: " + fruit.getQuantity());
            int quantity = input.inputQuantity();
            if (quantity > fruit.getQuantity()) {
                System.out.println("No enough");
            } else {
                fruit.setQuantity(fruit.getQuantity() - quantity);
                orderList.put(fruit, quantity);
                System.out.println("Do youn want to order now (Y/N)");
                String choice = input.checkYN();
                if (choice.equals("Y")) {
                    printFruit(orderList);
                    System.out.println("Enter customer name: ");
                    String customerName = input.checkString();
                    Customer customer = new Customer(customerName, orderList);
                    mo.addOrder(customer);
                    break;
                }
            }
        }
    }

    // -------------------------- Print Fruit
    public void printFruit(Map<Fruit, Integer> choosen) {
        Formatter ft = new Formatter();
        double amount = 0;
        double sum = 0;
        System.out.println("Product " + "| Quantity" + "| Price " + "| Amount");
        for (Fruit fr : choosen.keySet()) {
            amount += choosen.get(fr) * fr.getPrice();
            sum += amount;
            ft.format("%1s %6s %9s %9s \n ", fr.getFruitName(), choosen.get(fr), fr.getPrice(), choosen.get(fr) * fr.getPrice());

        }
        System.out.println(ft);
        System.out.println("Total: " + amount + "$");
    }
}
