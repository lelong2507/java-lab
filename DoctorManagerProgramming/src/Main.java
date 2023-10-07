
import controller.DoctorProgram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author longle2507
 */
public class Main {

    // ------------------- 2023/10/02
    public static void main(String[] args) {
        String mChon[] = {"Add new doctor", "Update doctor", "Delete doctor", "Search doctor", "Exit"};
        DoctorProgram dp = new DoctorProgram("Doctor Management", mChon);
        dp.run();
    }
}
