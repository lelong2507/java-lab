
import controller.FruitShopSystem;

//import controller.FruitShopSystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author longle2507
 */
public class Main {
    // ---------------- 2023/09/25
    public static void main(String[] args) {
        String mChon[] = {"Create Fruit", "View oders", "Shopping", "Exit"};
        FruitShopSystem frs = new FruitShopSystem("FRUIT SHOP SYSTEM", mChon);
        frs.run();
    }
}
