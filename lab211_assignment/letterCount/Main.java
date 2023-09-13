package letterCount;

import letterCount.controller.MyProgram;

public class Main {
    public static void main(String[] args) {
        String [] mChon = {"Count","Exit"};
        MyProgram mpr = new MyProgram("Main Menu", mChon);
        mpr.run();
    }
}
