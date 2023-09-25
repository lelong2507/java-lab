/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.Customer;
import model.Fruit;

/**
 *
 * @author longle2507
 */
public class ManagerOrder {

    private List<Customer> cusList;

    public ManagerOrder() {
        cusList = new ArrayList<>();
    }
    
    // ---------------- Print order list
    public void showAll() {
        Formatter ft = new Formatter();
        double amount = 0;
        double sum = 0;
        for (Customer customer : cusList) {
            System.out.println("Customer name: " + customer.getCustomerName());
            System.out.println("Product " + "| Quantity" + "| Price " + "| Amount");
            for(Fruit fr : customer.getOrderList().keySet()){
                amount += customer.getOrderList().get(fr) * fr.getPrice();
                sum += amount;
                ft.format("%1s %6s %9s %9s \n ", fr.getFruitName(),customer.getOrderList().get(fr),fr.getPrice(),amount);
            }
            System.out.println(ft);
            System.out.println("Total: " + sum + "$");
        }
        
    }
    
    // ---------------- Add Customer
    public void addOrder(Customer cus) {
        cusList.add(cus);
    }
    
}
