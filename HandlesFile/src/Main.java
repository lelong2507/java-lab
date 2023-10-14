
import controller.HandlesFileProgram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author longle2507
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Find person infor", "Copy Text to new File", "Exit"};
        HandlesFileProgram hfp = new HandlesFileProgram("File Proccessing", mChon);
        hfp.run();
    }
}
