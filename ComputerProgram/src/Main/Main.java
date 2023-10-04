/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controller.ComputerProgram;

/**
 *
 * @author longle2507
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // ---------------------------------------- 2023/10/02
    public static void main(String[] args) {
        String mChon[] = { "Normal Calcutor", "BMI Calculator", "Exit" };
        ComputerProgram cp = new ComputerProgram("Calculator Program", mChon);
        cp.run();
    }

}
