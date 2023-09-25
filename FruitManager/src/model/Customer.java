/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Hashtable;
import java.util.*;

public class Customer {

    private String customerName;
    private Map<Fruit, Integer> orderList;

    public Customer() {

    }

    public Customer(String customerName, Map<Fruit, Integer> order) {
        this.customerName = customerName;
        this.orderList = order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Map<Fruit, Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<Fruit, Integer> orderList) {
        this.orderList = orderList;
    }

}
