package controller;

import java.io.File;
import java.util.Scanner;

import view.Menu;

public class Program extends Menu {

    private ProgramManagement pm;
    private Scanner sc;
    static String[] mChon = { "Count word in file", "Find file By Word", "Exit" };

    public Program() {
        super("Word Program", mChon);
        pm = new ProgramManagement();
        sc = new Scanner(System.in);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                String path = sc.nextLine();
                System.out.print("Enter Word: ");
                String wordCount = sc.nextLine();
                File file1 = new File(path);
                System.out.print("Bout: " + pm.f1(file1, wordCount));
                System.out.println();
                break;
            case 2:
                System.out.println("Enter Folder: ");
                String folder = sc.nextLine();
                System.out.print("Enter Word: ");
                String wordFind = sc.nextLine();
                File file2 = new File(folder);
                pm.f2(file2, wordFind);
                break;
            case 3:
                System.exit(0);
        }
    }

}
