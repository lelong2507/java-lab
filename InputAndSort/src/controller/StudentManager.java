/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import respository.*;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class StudentManager extends Menu {

    private List<Student> stdList;
    IStudentRespository mn;
    static String[] mc = {"Add student", "Show All", "Exit"};

    public StudentManager() {
        super("Collection Sort Program", mc);
        stdList = new ArrayList<>();
        mn = new StudentRespository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                mn.addStudent(stdList);
            }
            case 2 -> {
                mn.showAll(stdList);
            }
            case 3 -> {
                System.exit(0);
            }
        }
    }

}