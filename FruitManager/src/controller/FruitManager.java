/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.Fruit;

/**
 *
 * @author longle2507
 */
public class FruitManager {

    private List<Fruit> fruList = new ArrayList<>();

    public FruitManager() {
        Fruit fruit1 = new Fruit("1", "Mango", 2, 23, "Us");
        Fruit fruit2 = new Fruit("2", "Water melon", 2, 23, "ThaiLand");
        Fruit fruit3 = new Fruit("3", "Coconut", 2, 23, "Lao");
        Fruit fruit4 = new Fruit("4", "Mango", 2, 23, "VietNam");
        fruList.add(fruit1);
        fruList.add(fruit2);
        fruList.add(fruit3);
        fruList.add(fruit4);
    }

    // ---------------- Search fruit
    public Fruit searchFruit(String idFruit) {
        return fruList.stream().filter(fruit -> idFruit.equals(fruit.getFruitId())).findAny().orElse(null);
    }

    // ---------------- Add fruit
    public boolean addFruit(Fruit fruit) {
        return fruList.add(fruit);
    }

    // ---------------- Remove fruit
    public void removeFruit(String idFruit) {
        fruList.remove(searchFruit(idFruit));
    }

    // ---------------- Display All
    public void displayFru() {
        Formatter formatter = new Formatter();
        System.out.println("| ++ Item ++ " + "| ++ Fruit Name ++ " + "| ++ Origin ++ " + "| ++ Price ++ |");
        for (Fruit fruit : fruList) {
            formatter.format("%6s %15s %18s %20s\n", fruit.getFruitId(), fruit.getFruitName(),
                    fruit.getOrigin(), fruit.getPrice());
        }
        System.out.println(formatter);
    }
    public static void main(String[] args) {
        FruitManager fm = new FruitManager();
        fm.displayFru();
    }
}
