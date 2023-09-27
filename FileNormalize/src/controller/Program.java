/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import view.Menu;

/**
 *
 * @author longle2507
 */
public class Program extends Menu<FileManager> {

    FileManager fm;

    public Program(String title, String[] mc) {
        super(title, mc);
        fm = new FileManager();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addFile();
                break;
            case 2:
                convert();
                break;
            case 3:
                outputFile();
                break;
            case 4:
                System.exit(0);
        }
    }

    // --------------------- Add file
    public void addFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content: ");
        String content = sc.nextLine();
        fm.outputFile(content, "input");
    }

    // -------------------- Output File
    public void outputFile() {
        System.out.println(fm.inputFile("output"));
    }
    
    //--------------------- Convert
    public void convert(){
        System.out.println("Convert Success");
        fm.outputFile(fm.normalizeFile(fm.inputFile("input")), "output");
    }
}
