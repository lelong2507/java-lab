package ChangeNumber.src;

import ChangeNumber.src.controller.Program;

public class main {
    public static void main(String[] args) {
        String[] mChon = { "Execute", "Exit" };
        Program pr = new Program("Main Menu", mChon);
        pr.run();
    }

}
