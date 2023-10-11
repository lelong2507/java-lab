import controller.WorkerProgram;

public class Main {
    public static void main(String[] args) {
        String mChon[] = { "Add ", "Increase salary", "Decrease salary", "Display", "Exit" };
        WorkerProgram wp = new WorkerProgram("Worker Management", mChon);
        wp.run();
    }

}
