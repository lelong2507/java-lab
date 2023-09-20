/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import model.*;
import view.Menu;
import view.Validation;

/**
 *
 * @author longle2507
 */
public class ManagerSystem extends Menu<Candidate> {

    protected Predicate predicate;
    protected Algorithm alg;
    protected Validation val;
    protected Candidate can;
    protected Exprience exp;
    protected Fresher fr;
    protected Internship is;
    protected ArrayList<Candidate> canList = new ArrayList<>();

    public ManagerSystem(String td, String[] mc) {
        super(td, mc);
        alg = new Algorithm();
        can = new Candidate();
        exp = new Exprience();
        fr = new Fresher();
        is = new Internship();
        val = new Validation();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                alg.addCandidate(canList);
                break;
            case 2:
                searching();
                break;
            case 3:
                System.exit(0);
                break;
                
        }
    }

    public void searching() {
        System.out.println("Enter choice to search: 1. Search Name || 2. Search By Type");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1:
                alg.searchName(canList);
                break;
            case 2:
                alg.searchType(canList);
                break;
            default:
                System.out.println("Just two!");
        }

    }
}
