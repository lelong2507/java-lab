import controller.AccountProgram;

public class Main {

    // ---------------------- 2023/10/06
    public static void main(String[] args) {
        String mChon[] = { "Create a new Account", "Login", "Exit" };
        AccountProgram ap = new AccountProgram("USER MANAGEMENT SYSTEM", mChon);
        ap.run();
    }
}
