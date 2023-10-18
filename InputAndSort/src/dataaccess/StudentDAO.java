/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import common.ScannerFactory;
import java.util.*;
import model.Student;

/**
 *
 * @author longle2507
 */
public class StudentDAO {
    ScannerFactory sc;
    private static StudentDAO instance = null;

    public StudentDAO() {
        sc = new ScannerFactory();
    }

    public static StudentDAO Instance() {
        if (instance == null) {
            synchronized (StudentDAO.class) {
                if (instance == null) {
                    instance = new StudentDAO();
                }
            }
        }
        return instance;
    }

    public void addStudent(List<Student> stdList) {
        while (true) {
            System.out.println("Please input student information");
            String name = sc.getString("Name: ");
            String classes = sc.getString("Classes: ");
            float mark = sc.getDouble("Mark: ");
            stdList.add(new Student(name, mark, classes));
            System.out.println("Do you want to enter more student information?(Y/n)");
            String choice = sc.getYN();
            if (choice.equals("n")) {
                break;
            }
        }
    }

    public void showAll(List<Student> stdList) {
        Collections.sort(stdList, Comparator.comparing(Student::getName));
        for (Student std : stdList) {
            System.out.println("-----Student " + (stdList.indexOf(std) + 1) + "-----");
            System.out.println("Name: " + std.getName());
            System.out.println("Classes: " + std.getClasses());
            System.out.println("Mark: " + std.getMark());
        }
    }
}
