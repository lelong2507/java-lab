/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.ArrayList;
import model.Grab;
import view.Menu;

/**
 *
 * @author longle2507
 */
public class Program extends Menu<Grab> {
    protected ArrayList<Grab> grabList;
    protected Algorithm alg;

    public Program(String title, String[] mc) {
        super(title, mc);
        this.grabList = new ArrayList<>();
        this.alg = new Algorithm();
    }
    
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                System.out.println(alg.addList(grabList));
                break;
            case 2:
                alg.removeEle(grabList);
                break;
            case 3:
                if(alg.search(grabList)){
                    System.out.println("The driver have in program!");
                }else{
                    System.out.println("Not found");
                }
                break;
            case 4:
                alg.showList(grabList);
                break;
            case 5:
                alg.printAllStatus(grabList);
                break;
            case 6:
                alg.printBill(grabList);
                break;
            case 7:
                alg.changeStatus(grabList);
                break;
            case 8:
                alg.deleteAll(grabList);
                break;
            case 9:
                System.exit(0);
                
        }
    }
    
}
