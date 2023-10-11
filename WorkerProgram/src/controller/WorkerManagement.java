package controller;

import java.util.*;

import model.*;
import view.Input;

public class WorkerManagement {

    Input input = new Input();
    List<Worker> woList = new ArrayList<>();

    // ------------------ AddListWorker
    public boolean addWorker(Worker wo) {
        return woList.add(wo);
    }

    public boolean changeSalary(SalaryStatus status, int code, double amount, String choose, String date,List<Worker> wList) {
        for (int i = 0; i < wList.size(); i++) {
            if (code == wList.get(i).getId()) {
                if (choose.equals("Increase")) {
                    System.out.println("UP salary");
                    wList.get(i).increaseSalary(amount);
                } else if (choose.equals("Decrease")) {
                    System.out.println("DOWN salary");
                    wList.get(i).decreaseSalary(amount);
                }
                return true;
            }
        }
        return false;
    }

   

}
