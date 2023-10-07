/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.Doctor;
import view.Input;

/**
 *
 * @author longle2507
 */
public class DoctorManagament {

    Map<String, Doctor> docList = new HashMap<>();
    Input in = new Input();

    public DoctorManagament() {
        Doctor doc1 = new Doctor("DOC 1", "Long", "NK", 5);
        Doctor doc2 = new Doctor("DOC 2", "Vu", "NK", 5);
        Doctor doc3 = new Doctor("DOC 3", "Uyen", "NK", 5);
        docList.put(doc1.getCode(), doc1);
        docList.put(doc2.getCode(), doc2);
        docList.put(doc3.getCode(), doc3);
    }

    // Function 1: Add docList
    public boolean addDoctor(Doctor doctor) throws Exception {
        if (doctor == null) {
            throw new Exception("Data does not exist");
        }

        if (!notDuplicateCode(doctor.getCode())) {
            throw new Exception(doctor.getCode() + " is duplicate");
        }

        docList.put(doctor.getCode(), doctor);
        return true;
    }

    // Function 2: Update doctor
    public void updateDoctor(String code) throws Exception {

        if (searchDoctor(code) == false) {
            throw new Exception("Doctor code doesn’t exist");
        } else {
            System.out.println(docList.get(code).toString());
            String newCode = "";
            while (true) {
                newCode = in.inputCode();
                if (notDuplicateCode(newCode)) {
                    break;
                } else {
                    System.out.println("Code is exist");
                }
            }
            String newName = in.inputName();
            String newSpe = in.inputSpecialization();
            int newAva = in.inputAvailability();
            docList.get(code).setCode(newCode);
            docList.get(code).setName(newName);
            docList.get(code).setSpecialization(newSpe);
            docList.get(code).setAvailability(newAva);
        }
    }

    // Function 3: Delete doctor
    public void deleteDoctor(String code) throws Exception {
        if (!docList.containsKey(code)) {
            throw new Exception("Data does not exist");
        }

        if (searchDoctor(code) == true) {
            docList.remove(code, docList.get(code));
        } else {
            System.out.println("Do not have");
        }

    }

    // Function 4: Search Doctor
    public boolean searchDoctor(String code) throws Exception {
        if (docList.isEmpty()) {
            throw new Exception("Database does not exist");
        }

        if (docList.containsKey(code)) {
            System.out.println(docList.get(code));
            return true;
        } else {
            System.out.println("Do not have");
            return false;
        }
    }

    // Function: check not duplicate
    public boolean notDuplicateCode(String code) {
        return !docList.containsKey(code);
    }
}
