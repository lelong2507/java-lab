import controller.Program;

public class Main {
    // -------------------------------------- 2023/09/30
    public static void main(String[] args) {
        String mChon [] = {"Superlative Equation", "Quaratic Equation","Exit"};
        Program pr = new Program("Equation Program", mChon);
        pr.run();
    }
}
