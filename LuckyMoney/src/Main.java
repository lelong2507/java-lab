
import controller.Program;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author longle2507
 */
public class Main {
    public static void main(String[]args){
        String mChon[] = {"Add", "Delete", "Check", "Display", "Draw Lots"};
        Program pr = new Program("Main Menu", mChon);
        pr.run();
        
    }
}
