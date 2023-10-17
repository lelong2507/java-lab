/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.*;

/**
 *
 * @author longle2507
 */
public class InputAndSortProgram implements Sort {

    private List<Student> stList = new ArrayList<>();

    public void addStdList(Student std) {
        stList.add(std);
    }

    @Override
    public void sortStudent(List<Student> stList) {
        Collections.sort(stList, new StudentComparator());
    }

    @Override
    public void display(List<Student> students) {
        for(int i = 0; i < stList.size();i++){
            System.out.println("------- Student " + (i + 1) + " -------" );
            System.out.println("Name: " + stList.get(i).getName());
            System.out.println("Mark: " + stList.get(i).getMark());
            System.out.println("Class: " + stList.get(i).getClasses());
        }
    }

}
