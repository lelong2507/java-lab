
import controller.PhoneManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author longle2507
 */
/*
1. Add new phone
2. Delete new phone
3. Display user
4. Display all phoneNumber
5. Delete all
6. Exit
*/
public class main {
    public static void main(String [] args){
        String [] mChon = {"Add", "Delete", "Display user", "Display all phoneNumber", "Delete all"};
        PhoneManager pm = new PhoneManager("Main Menu", mChon);
        pm.run();
    }
}
