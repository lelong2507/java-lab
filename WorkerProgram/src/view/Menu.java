package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;

    public Menu(String title, String mchon[]) {
        this.title = title;
        mChon = new ArrayList<>();
        for (String s : mchon) {
            mChon.add((T) s);
        }
    }

    public void display() {
        System.out.println("===================" + title + "===================");
        System.out.println("-------------------------------------");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + "." + mChon.get(i));
        }
        System.out.print("================================ ");

    }

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter selection..");
        return sc.nextInt();
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if (n > mChon.size()) {
                break;
            }
        }
    }

}
