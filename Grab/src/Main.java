
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

    public static void main(String[] args) {
        String[] mChon = {"Add", "Remove", "Search", "Show List", "Print all status", "Print Bill", "Change Status", "Delete all", "Exit"};
        Program pr = new Program("Main menu", mChon);
        pr.run();
    }

}
