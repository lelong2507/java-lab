package lab211_assignment.letterCharacter;

import lab211_assignment.letterCharacter.controller.Program;

public class Main {
    public static void main(String[] args) {
        String mChon[] = { "Find", "Count", "Exit" };
        Program pr = new Program("Main Menu", mChon);
        pr.run();
    }
}
