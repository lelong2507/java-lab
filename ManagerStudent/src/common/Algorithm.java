/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Collectors;
import model.*;
import view.Validation;

/**
 *
 * @author longle2507
 */
public class Algorithm {

    Validation val = new Validation();
    ArrayList<Candidate> canList = new ArrayList<>();

    public ArrayList addCandidate(ArrayList<Candidate> canList) {
        String id = val.checkId();
        String firstName = val.checkFirstName();
        String lastName = val.checkLastName();
        String birthDay = val.checkBirthDay();
        String address = val.checkAddress();
        String phone = val.checkPhone();
        String email = val.checkEmail();
        String type = val.checkType();
        switch (type) {
            case "1":
                String graduationDate = val.checkGraduation();
                String rank = val.checkRank();
                String education = val.checkEducation();
                Candidate candidate = new Fresher(id, firstName, lastName, birthDay, address, phone, email, type, graduationDate, rank, education);
                canList.add(candidate);
                break;
            case "2":
                String exInYear = val.checkExpInYear();
                String proSkill = val.checkProSkill();
                Candidate candidate2 = new Exprience(id, firstName, lastName, birthDay, address, phone, email, type, exInYear, proSkill);
                canList.add(candidate2);
                break;
            case "3":
                String majors = val.checkMajors();
                String semester = val.checkSemester();
                String universityName = val.checkUniversityName();
                Candidate candidate3 = new Internship(id, firstName, lastName, birthDay, address, phone, email, type, majors, semester, universityName);
                canList.add(candidate3);
                break;
        }

        return canList;
    }

    public void searchName(ArrayList<Candidate> canList) {
        String name = val.checkFirstName();
        boolean found = false;
        for (int i = 0; i < canList.size(); i++) {
            if (canList.get(i).getFirstName().equals(name)) {
                System.out.println(canList.get(i).toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }

    public void printCandidateInfo(Candidate can) {
        System.out.println("Id: " + can.getId());
        System.out.println("First Name: " + can.getFirstName());
        System.out.println("Last Name: " + can.getLastName());
        System.out.println("BirthDay: " + can.getBirthDay());
        System.out.println("Address: " + can.getAddress());
        System.out.println("Phone number: " + can.getPhone());
        System.out.println("Email: " + can.getEmail());
        System.out.println(can.toString());
    }

    public void searchType(ArrayList<Candidate> canList) {
        System.out.println("--------------- Fresher ------------");
        for (Candidate can : canList) {
            if (can instanceof Fresher) {
                printCandidateInfo(can);
            }
        }
        System.out.println("--------------- Internship ------------");
        for (Candidate can : canList) {
            if (can instanceof Internship) {
                printCandidateInfo(can);
            }
        }

        System.out.println("--------------- Experience ------------");
        for (Candidate can : canList) {
            if (can instanceof Exprience) {
                printCandidateInfo(can);
            }
        }
    }
}
