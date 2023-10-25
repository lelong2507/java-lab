package controller;

import java.util.Locale;

import model.*;
import view.Menu;

public class BankManagement extends Menu{
    static String mc[] = {"Viet Nam","English","Exit"};
    IBank ib;
    public BankManagement() {
        super("Login Program", mc);
        ib = new Bank();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                ib.setLocate(new Locale("vn", "VN"));
                ib.checkAccountNumber();
                ib.checkPassword();
            }
            case 2 -> {
                ib.setLocate(new Locale("en", "EN"));
                ib.checkAccountNumber();
                ib.checkPassword();
            }
            case 3 ->
                System.exit(0);
        }
    }
    
}
