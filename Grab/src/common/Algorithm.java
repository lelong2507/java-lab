/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.*;
import model.Grab;

/**
 *
 * @author longle2507
 */
public class Algorithm {

    Scanner sc = new Scanner(System.in);
    static ArrayList<Grab> grabList = new ArrayList<>();

    //----------------------------------------- Function add
    public ArrayList addList(ArrayList<Grab> grList) {
        System.out.println("Enter the number of Grab: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("====================");
            System.out.println("Driver#" + (i + 1));
            System.out.println("Enter the id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter name of driver: ");
            String nameDriver = sc.nextLine();
            System.out.println("Enter name of user: ");
            String nameUser = sc.nextLine();
            System.out.println("Enter the number of Km: ");
            double numberOfKm = Double.parseDouble(sc.nextLine());
            System.out.println("Journey done?");
            boolean isDone = Boolean.parseBoolean(sc.nextLine());
            Grab grab = new Grab(id, nameDriver, nameUser, numberOfKm, isDone);
            grList.add(grab);
            System.out.println("====================");
        }
        return grList;
    }

    //----------------------------------------- Function delete
    public void removeEle(ArrayList<Grab> grList) {
        System.out.println("Enter the name of driver: ");
        String nameDelete = sc.nextLine();
        for (int i = 0; i < grList.size(); i++) {
            if (nameDelete.equals(grList.get(i).getNameDriver())) {
                grList.remove(i);
            }
        }
    }

    //----------------------------------------- Function Search
    public boolean search(ArrayList<Grab> grList) {
        System.out.println("Enter id to search: ");
        int search = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < grList.size(); i++) {
            if (search == grList.get(i).getId()) {
                return true;
            }
        }
        return false;
    }

    //----------------------------------------- Function Clear
    public void deleteAll(ArrayList<Grab> grList) {
        grList.clear();
    }

    //----------------------------------------- Function display
    public void showList(ArrayList<Grab> grList) {
        for (int i = 0; i < grList.size(); i++) {
            System.out.println(grList.get(i).toString());
        }
    }

    //----------------------------------------- Print all Status
    public void printAllStatus(ArrayList<Grab> grList) {
        for (Grab grab : grList) {
            if (grab.isIsDone() != false) {
                System.out.println("Grab ID: " + grab.getId() + "[x]");
            } else {
                System.out.println("Grab ID: " + grab.getId() + "[]");
            }
        }
    }

    //----------------------------------------- Print Bill
    public void printBill(ArrayList<Grab> grList) {
        for (Grab grab : grList) {
            if (grab.isIsDone() != false) {
                System.out.println("Bill for Grab " + grab.getId() + " is " + grab.getMoney());
            } else {
                System.out.println("The trip hasn't ended yet "
                        + "so we can't print the invoice yet");
            }
        }
    }

    //----------------------------------------- Function change status
    public void changeStatus(ArrayList<Grab> grList) {
        System.out.println("Enter ID to change: ");
        int idToChange = Integer.parseInt(sc.nextLine());
        System.out.println("Change the status: ");
        boolean change = Boolean.parseBoolean(sc.nextLine());

        for (Grab grab : grList) {
            if (idToChange == grab.getId()) {
                if (grab.isIsDone()) {
                    System.out.println("Journey is already done, so cannot change the status.");
                } else {
                    grab.setIsDone(change);
                    System.out.println("Status changed successfully.");
                }
            }
        }
    }

}
