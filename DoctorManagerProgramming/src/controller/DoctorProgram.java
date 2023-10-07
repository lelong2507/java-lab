/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import view.Input;
import view.Menu;

/**
 *
 * @author longle2507
 */
public class DoctorProgram extends Menu<Doctor> {

    Input in;
    Doctor doc;
    List<Doctor> docList;
    DoctorManagament dm;

    public DoctorProgram(String title, String[] mc) {
        super(title, mc);
        in = new Input();
        doc = new Doctor();
        docList = new ArrayList<>();
        dm = new DoctorManagament();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                try {
                    add(docList);
                } catch (Exception ex) {
                    Logger.getLogger(DoctorProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 2: {
                try {
                    update();
                } catch (Exception ex) {
                    Logger.getLogger(DoctorProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 3: {
                try {
                    delete();
                } catch (Exception ex) {
                    Logger.getLogger(DoctorProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 4: {
                try {
                    search();
                } catch (Exception ex) {
                    Logger.getLogger(DoctorProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 5:
                System.exit(0);
        }
    }

    // -------------------- Add DoctorList
    public void add(List<Doctor> dList) throws Exception {
        System.out.print("Enter number of doctors: ");
        int n = in.inputNumberEle();
        for (int i = 0; i < n; i++) {
            String code = "";
            while (true) {
                code = in.inputCode();
                if (dm.notDuplicateCode(code)) {
                    break;
                } else {
                    System.out.println("Code is exist!");
                }
            }
            String name = in.inputName();
            String spe = in.inputSpecialization();
            int avai = in.inputAvailability();
            doc = new Doctor(code, name, spe, avai);
            dm.addDoctor(doc);
        }
    }

    // -------------------- Update Doctor
    public void update() throws Exception {
        String code = in.inputCode();
        dm.updateDoctor(code);
    }

    // -------------------- Delete Doctor
    public void delete() throws Exception {
        String code = in.inputCode();
        dm.deleteDoctor(code);
    }

    // -------------------- Search Doctor
    public void search() throws Exception {
        String code = in.inputCode();
        if (dm.searchDoctor(code) == false) {
            System.out.println(code + " doesn't have in data");
        }
    }

}
