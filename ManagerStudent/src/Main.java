package ManagerStudent.src;

import ManagerStudent.src.controller.Program;

public class Main {
    public static void main(String[] args) {
        String mChon [] = {"Add", "Find and Sort", "Update and Delete","Report","Exit"};
        Program pr = new Program("Main Menu", mChon);
        pr.run();
    }
}
