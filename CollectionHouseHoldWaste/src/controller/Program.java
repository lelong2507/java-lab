package controller;

import java.util.Scanner;

import model.Garbage;
import view.Menu;

public class Program extends Menu {
    private Garbage[] truckArray;
    private int numberOfStation;
    private Scanner sc;
    private CollectionGarbageManament cgm;
    private Garbage cg;

    static String[] mc = { "Add rac", "Thoat dum`" };

    public Program() {
        super("Collecting Household Waste", mc);
        cgm = new CollectionGarbageManament();
        cg = new Garbage();
        sc = new Scanner(System.in);
        truckArray = new Garbage[numberOfStation];
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                executeProgram();
                break;
            case 2:
                System.exit(0);
                ;
        }
    }

    public void executeProgram() {
        System.out.print("Nhap so tram: ");
        numberOfStation = sc.nextInt();
        cgm.collectTrash(numberOfStation,truckArray);
    }

}
