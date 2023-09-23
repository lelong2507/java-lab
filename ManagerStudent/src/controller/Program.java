package ManagerStudent.src.controller;

import java.util.ArrayList;

import ManagerStudent.src.common.Algorithm;
import ManagerStudent.src.view.Menu;
import ManagerStudent.src.model.Student;

public class Program extends Menu<Student> {
    protected Algorithm alg;
    protected ArrayList<Student> stdList = new ArrayList<>();

    public Program(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                alg.addStudentList(stdList);
                break;
            case 2:
                alg.findAndSort(stdList);
                break;
            case 3:
                alg.updateAndDelete(stdList);
                break;
            case 4:
                alg.report(stdList);
                break;
            case 5:
                System.exit(0);
        }
    }

}
