/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Validation;
import java.util.*;
import model.entity.*;
import model.repository.*;

/**
 *
 * @author longle2507
 */
public class IncomeTaxProgram {
    Validation valid;
    Person person;
    List<Children> childrens;
    List<Parent> parents;
    Repository repo;

    public IncomeTaxProgram() {
        valid = new Validation();
        person = new Person();
        childrens = new ArrayList<>();
        parents = new ArrayList<>();
        repo = new Repository();
    }

    public void run() {
        System.out.println("========Income Tax Program=========");
        repo.inputData(person, childrens, parents);
        repo.detailOfDeduction(person, childrens, parents);
    }
}