/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.Scanner;
import model.Money;
import view.*;

/**
 *
 * @author longle2507
 */
public class Program extends Menu<String> {

    Scanner sc = new Scanner(System.in);
    private Algorithm alg;
    private Validation val;
    private Money money;

    public Program(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
        money = new Money();
        val = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                String addMoney = val.checkMoney();
                System.out.println("addMoney: " + addMoney);
                money = new Money(addMoney);
                alg.addMoney(addMoney);
                break;
            case 2:
                String deleteMoney = val.checkMoney();
                System.out.println("Delete money: " + deleteMoney);
                money = new Money(deleteMoney);
                if(alg.deleteMoney(deleteMoney) == true){
                    System.out.println("Delete Success");
                }else{
                    System.out.println(deleteMoney +"Not found");
                }
                
                break;
            case 3:
                String checkMoney = val.checkMoney();
                System.out.println("Check money: " + checkMoney);
                money = new Money(checkMoney);
                if (alg.checkMoney(checkMoney) == true) {
                    System.out.println("Your prize " + checkMoney + " still in vault");
                } else {
                    System.out.println("Not found");
                }

                break;
            case 4:
                alg.displayAll();
                break;
            case 5:
                System.out.println("Your price: " + alg.drawLots());
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
