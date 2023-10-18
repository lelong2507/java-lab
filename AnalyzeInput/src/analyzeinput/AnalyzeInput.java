/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analyzeinput;

import controller.Program;

/**
 *
 * @author longle2507
 */
public class AnalyzeInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mChon[] = {"Add String", "Analyze String","Exit"};
        Program pr = new Program("Analysis String program", mChon);
        pr.run();
    }
    
}
