import controller.DictonaryProgram;

public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Add","Delete","Translate","Exit"};
        DictonaryProgram dp = new DictonaryProgram("Dictonary Program", mChon);
        dp.run();
    }   
}
