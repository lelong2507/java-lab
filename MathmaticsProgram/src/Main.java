import controller.Program;

public class Main {
    public static void main(String[] args) {
        String mChon [] = {"Superlative Equation", "Quaratic Equation","Exit"};
        Program pr = new Program("Equation Program", mChon);
        pr.run();
    }
}
