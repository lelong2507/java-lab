/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.*;
import model.Money;
import view.Validation;

/**
 *
 * @author longle2507
 */
/*
1. add money
2. delete money
3. Check money
4. display all money
5.Draw lots
6. Exit*/
public class Algorithm {

    private Set<String> moneyVault = new TreeSet<String>();
    static Money money = new Money();
    static Validation val = new Validation();
    public void addMoney(String valueMoney) {
        this.moneyVault.add(valueMoney);
    }

    public boolean deleteMoney(String valueMoney) {

        if (moneyVault.contains(valueMoney)) {
            return this.moneyVault.remove(valueMoney);
        } else {
            return false;
        }
    }

    public boolean checkMoney(String money) {
        if (moneyVault.contains(money)) {
            return true;
        } else {
            return false;
        }
    }

    public void displayAll() {
        System.out.println(Arrays.toString(moneyVault.toArray()));
    }

    public String drawLots() {
        String result = "";
        Random rd = new Random();
        int randomIndex = rd.nextInt(moneyVault.size());
        result = (String) this.moneyVault.toArray()[randomIndex];
        return result;
    }

   
}
