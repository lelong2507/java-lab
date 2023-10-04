import controller.ContactProgram;
import view.Input;

public class Main {
    
    // ----------------------- 2023/10/02
    public static void main(String[] args) {
        String mChon[] = { "Add a contract", "Display all Contract", "Delete a Contract", "Exit" };
        ContactProgram cp = new ContactProgram("Contact Program", mChon);
        cp.run();
    }
}
