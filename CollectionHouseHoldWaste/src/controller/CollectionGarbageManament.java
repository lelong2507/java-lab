package controller;

import java.util.Scanner;

import model.*;

public class CollectionGarbageManament {
    private Garbage gb = new Garbage();
    private Truck tk = new Truck();

    // ------ Collect Trash
    public void collectTrash(int numberOfTrash, Garbage[] truckArray) {
        int kgOfTrash = 0;
        Scanner sc = new Scanner(System.in);
        truckArray = new Garbage[numberOfTrash];
        for (int i = 0; i < numberOfTrash; i++) {
            System.out.println("Tram#" + (i + 1));
            kgOfTrash = sc.nextInt();
            truckArray[i] = new Garbage(kgOfTrash);
        }
        tk = new Truck(truckArray);
        System.out.println("==========================");
        System.out.println("Sum of Trash: " + sumTrash(truckArray) + " Kg");
        costOfBidding(truckArray);
        System.out.println("==========================");
    }

    // --------------- Sum trash
    public int sumTrash(Garbage[] trashArray) {
        int sumTrash = 0;
        for (int i = 0; i < trashArray.length; i++) {
            sumTrash += trashArray[i].getGarbage();
        }
        return sumTrash;
    }

    // -------------- The cost of Bidding
    public void costOfBidding(Garbage[] truckGarbage) {
        // Calculate Minutes
        int trashTime = truckGarbage.length * 8;

        // Calculate go to and from dump
        int dumpTime = Math.ceilDiv(sumTrash(truckGarbage), 10000) + 1;

        // Calculate Minutes to tranfers
        int minutesTranfers = dumpTime * 30;

        // Calculate dump cost
        int dumpCost = dumpTime * 57000;

        // Calculate cost for tranfer
        int tranferCost = dumpCost + ((trashTime + minutesTranfers) * (120000 / 60));

        System.out.println("Trash Time: " + trashTime + " times");
        System.out.println("Dump Time: " + dumpTime + " times");
        System.out.println("Minutes Tranfer: " + minutesTranfers + " minutes");
        System.out.println("Total cost: " + tranferCost + " VND");
    }
}
