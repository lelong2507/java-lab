/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.Student;
import view.Input;
import view.Menu;

/**
 *
 * @author longle2507
 */
public class Program extends Menu<Student> {

    private InputAndSortProgram iasp;
    private Student std;
    private Input in;
    private List<Student> stdList;

    public Program(String td, String[] mc) {
        super(td, mc);
        iasp = new InputAndSortProgram();
        std = new Student();
        in = new Input();
        stdList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addSort();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                System.exit(0);
        }
    }

    // --------------- addAndSort
    public void addSort() {

        Scanner sc = new Scanner(System.in);
        String choice = "Y";

        while (choice.equalsIgnoreCase("Y")) {
            System.out.println("Please input information of student:");
            System.out.print("Enter Name: ");
            String name = in.inputString();
            System.out.print("Enter Mark: ");
            float mark = in.inputFloat();
            System.out.print("Enter Classes:");
            String classes = in.inputString();

            std = new Student(name, mark, classes);
            stdList.add(std);
            iasp.addStdList(std);
            iasp.sortStudent(stdList);

            System.out.println("Do you want to continue? (Y/N)");
            choice = sc.nextLine();

        }
    }
    // --------------- display

    public void displayAll() {
        iasp.display(stdList);
    }

}
